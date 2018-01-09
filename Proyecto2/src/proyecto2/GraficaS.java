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
public class GraficaS {
    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice;
    
    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";
    
    public GraficaS(){
        
    }
    
    public void graficar(NodoS raiz, String nombre) throws IOException
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
    
    public void declararNodos(NodoS raiz)
    {
        if(raiz != null)
        {
             
            pr.println("node"+indice+"[label = " +"\"{<val>Estación["+ raiz.dato+ "]|<ptr> siguiente}\""+ "];");
            indice++;
            if(raiz.siguiente != null)
                declararNodos(raiz.siguiente);
                
        }
                            pr.println("node"+indice+"[label = " +"\"{<val>Mantenimiento}\""+ "] [style=filled];");  
    }
    
    public void enlazarNodos(NodoS raiz, int actual)
    {
        if(raiz != null)
        {
            if(raiz.siguiente != null)
            {   
                indice++;
                pr.println("\"node" + actual + "\":ptr->" + "\"node" + indice+ "\"");
                enlazarNodos(raiz.siguiente,indice);
            }
        }
      
    }
        
    
    
}
