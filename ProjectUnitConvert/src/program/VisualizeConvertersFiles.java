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
 * @author Lucas Alkimim Chaves
 */
public class VisualizeConvertersFiles {

    private List<String> namesOfTheArchives = new ArrayList<String>();
    private String path = System.getProperty("user.dir");
    private String fileNameWithOutExt;

    /**
     * Search in the directory, get the name of the archives and returns a list
     * with the names method
     *
     * @return namesOfTheArchives
     * @throws Exception
     */
    public List<String> VisualizeConvertersFiles() throws Exception {

        File file = new File(path + "/src/converters");
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
