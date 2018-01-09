package proyecto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author JorgeAntonio
 */
public class GraficaDobleOrdenada {
    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice;
    
    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";
    
    public GraficaDobleOrdenada(){
        
    }
    
    public void graficar(NodoListaOrdenada raiz, String nombre) throws IOException
    {
        String filein;
        String fileout;
        
        filein = nombre + ".txt";
        fileout = nombre + ".jpg";
        
        f = new File(filein);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        

        pr.println("digraph G {");
        pr.println("rankdir=LR;");
        pr.println("node [shape=record];");
        
        indice = 0;
        declararNodos(raiz);
        
        indice = 0;
        enlazarNodos(raiz, 0);
        
        pr.println("}");

        //**
        pr.close();
        bw.close();
        
        
        String [] cmd = {DOT_PATH, TPARAM, filein, TOPARAM, fileout};
        Runtime rt = Runtime.getRuntime();
        rt.exec(cmd);
    }   
    public void declararNodos(NodoListaOrdenada raiz)
    {
        if(raiz != null)
        {
             
            //pr.println("node"+indice+"[label = " +"\"{<val>Avión["+ raiz.dato+ "]|<ptr> siguiente}\""+ "];");
            //pr.println("node"+indice+"[label = " +"\"{|<ptr> <val>Avión["+ raiz.dato+ "] |<ptr> siguiente }\""+ "];");
            indice++;
            if(raiz.siguiente != null)
                declararNodos(raiz.siguiente);
                
        }
    }
    public void enlazarNodos(NodoListaOrdenada raiz, int actual)
    {
        if(raiz != null)
        {
            if(raiz.siguiente != null)
            {   
                indice++;
                pr.println("\"Escritorio " + raiz.id + "\":ptr->" + "\"Escritorio " + raiz.siguiente.id+ "\"");
                pr.println("\"Escritorio " + raiz.siguiente.id + "\":ptr->" + "\"Escritorio " + raiz.id+ "\"");
                
                enlazarNodos(raiz.siguiente,indice);
                
            } 
        }
                    pr.println("node"+indice+"[label = " +"\"{<val>Escritorio de registro}\""+ "] [style=filled];");
    }
        
    
    
}
