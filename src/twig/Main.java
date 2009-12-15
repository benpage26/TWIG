/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package twig;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author ben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, IOException {
        // TODO code application logic here

//        Village.refreshVillageData();
        
        Village.getAllVillages();

    }

}
