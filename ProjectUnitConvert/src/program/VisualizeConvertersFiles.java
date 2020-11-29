package program;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class VisualizeConvertersFiles {

    private List<String> namesOfTheArchives = new ArrayList<String>();
    private String path = "C:\\Users\\PC\\Unit-Converter\\ProjectUnitConvert\\src\\converters";
    private String fileNameWithOutExt;

    public List<String> VisualizeConvertersFiles() throws Exception {

        File file = new File(path);
        File[] archives = file.listFiles();

        for (File archive : archives) {

            if (!archive.getName().equals("Enum") && !archive.getName().equals("ClassInterface")) {

                fileNameWithOutExt = archive.getName().replaceFirst("[.][^.]+$", "");
                namesOfTheArchives.add("converters." + fileNameWithOutExt);
                
            }

        }
        
        Collections.sort(namesOfTheArchives);
        return namesOfTheArchives;
    }
}
