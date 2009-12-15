/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twig;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.xron.io.FileDownloader;

/**
 *
 * @author ben
 */
public class Village {


//    $id, $name, $x, $y, $player, $points, $rank
    int id;
    String name;
    short x;
    short y;
    int player;
    int points;
    int rank;

    public Village(int id, String name, short x, short y, int player, int points, int rank) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.player = player;
        this.points = points;
        this.rank = rank;
    }



    ////////
    public static void refreshVillageData() throws MalformedURLException {
        final String address = "http://en40.tribalwars.net/map/village.txt"; // todo: use the txt.gz version
        final File dest = new File("villages.txt");

        URL source = new URL(address);
        FileDownloader.downloadURLByNIO(source, dest);
    }

    /**
     *
     */
    public static Village[] getAllVillages() throws FileNotFoundException, IOException {
        //OPTIMIZE?

        ArrayList<Village> villages = new ArrayList<Village>(2000);

        BufferedReader fin = new BufferedReader(new FileReader("villages.txt"));

        String line = fin.readLine();
        System.out.println("Starting Parse");
        long lineCount = 0;
        while(line != null){
            String[] split = line.split(",");
            Village v = new Village(
                    Integer.valueOf(split[0]),
                    URLDecoder.decode(split[1], "UTF-8"),
                    Short.valueOf(split[2]),
                    Short.valueOf(split[3]),
                    Integer.valueOf(split[4]),
                    Integer.valueOf(split[5]),
                    Integer.valueOf(split[6]));
            villages.add(v);
            lineCount++;
            if(lineCount%50 == 0) {
                System.out.println(lineCount);
            }
            line = fin.readLine();

        }

        fin.close();

        return villages.toArray(new Village[villages.size()]);
    }
}
