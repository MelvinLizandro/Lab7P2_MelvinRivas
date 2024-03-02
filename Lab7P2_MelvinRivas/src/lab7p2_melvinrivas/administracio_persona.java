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
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author l3306
 */
public final class administracio_persona {
    
        private ArrayList<producto> produc = new ArrayList();
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
        return produc;
    }

    public void setListaPersonas(ArrayList<producto> listaPersonas) {
        this.produc = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + produc;
    }

    //extra mutador
    public void setPersona(producto p) {
        this.produc.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (producto t : produc) {
                bw.write(t.getId()+ ",");
                bw.write(t.getName() + ",");
                bw.write(t.getCategory()+ ",");
                bw.write(t.getPrice()+ ",");
                bw.write(t.getAisle()+ ",");
                bw.write(t.getBin()+ ",");
            }
            bw.flush();
        } catch (Exception e) {
            
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        produc = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                double precio = Double.parseDouble(datos[3]);
                int otroDato1 = Integer.parseInt(datos[4]);
                int otroDato2 = Integer.parseInt(datos[5]);

                produc.add(new producto(id, nombre, cantidad, precio, otroDato1, otroDato2));
            }
            
        } catch (Exception e) {
            
        } 
            if (sc != null) {
                sc.close();
            }
        
    }
}