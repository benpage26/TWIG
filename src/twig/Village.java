/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twig;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xron.io.FileDownloader;

/**
 *
 * @author ben
 */
public class Village {

//    $id, $name, $x, $y, $player, $points, $rank
    ////////
    public static void refreshVillageData() throws MalformedURLException {
        final String address = "http://en40.tribalwars.net/map/village.txt"; // todo: use the txt.gz version
        final File dest = new File("village.txt");

        URL source = new URL(address);
        FileDownloader.downloadURLByNIO(source, dest);
    }
}
