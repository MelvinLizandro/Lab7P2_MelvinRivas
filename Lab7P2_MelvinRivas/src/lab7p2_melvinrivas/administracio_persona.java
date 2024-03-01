/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_melvinrivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class administracio_persona {
    
        private ArrayList<producto> producto = new ArrayList();
    private File archivo = null;

    public administracio_persona (String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<producto> getListaPersonas() {
        return producto;
    }

    public void setListaPersonas(ArrayList<producto> listaPersonas) {
        this.producto = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + producto;
    }

    //extra mutador
    public void setPersona(producto p) {
        this.producto.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (producto t : producto) {
                bw.write(t.getId()+ ";");
                bw.write(t.getName() + ";");
                bw.write(t.getCategory()+ ";");
                bw.write(t.getPrice()+ ";");
                bw.write(t.getAisle()+ ";");
                bw.write(t.getBin()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
            
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        producto = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    producto.add(new producto(sc.nextInt(),
                                    sc.nextLine(),
                                    sc.nextInt(),sc.nextDouble(),
                            sc.nextInt(),sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    
}
