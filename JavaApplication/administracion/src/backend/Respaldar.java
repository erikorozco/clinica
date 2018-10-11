/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author engine
 */
public class Respaldar {
    public void guardar(){
        JFileChooser guardar = new JFileChooser(new java.io.File(System.getProperty("user.home")));
        guardar.setDialogTitle("Realizar respaldo");
        guardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int estatus = guardar.showSaveDialog(null);
        
        if(estatus == JFileChooser.APPROVE_OPTION){
            final ArrayList<String> baseCmds = new ArrayList<String>();
            baseCmds.add("C:/Program Files (x86)/PostgreSQL/9.4/bin/pg_dump");
            baseCmds.add("-h");
            baseCmds.add("192.168.1.100");
            baseCmds.add("-U");
            baseCmds.add("postgres");
            baseCmds.add("-v");
            baseCmds.add("-Ft");
            baseCmds.add("-f");
            baseCmds.add(guardar.getSelectedFile() + ".backup");
            baseCmds.add("Aplicacion");
            final ProcessBuilder pb = new ProcessBuilder(baseCmds);

            // Set the password
            final Map<String, String> env = pb.environment();
            env.put("PGPASSWORD", "$@Lud1n73gral");

            try {
                final Process process = pb.start();

                final BufferedReader r = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
                String line = r.readLine();
                while (line != null) {
                    System.err.println(line);
                    line = r.readLine();
                }
                r.close();

                final int dcertExitCode = process.waitFor();
                JOptionPane.showMessageDialog(null, "Base de datos respaldada con éxito.\n"
                        + "Asegúrese de ponerla en un lugar seguro.");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
