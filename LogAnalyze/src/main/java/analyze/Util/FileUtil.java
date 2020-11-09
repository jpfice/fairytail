package analyze.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class FileUtil {

    private static Logger logger = Logger.getLogger(FileUtil.class);

    private List<String> lineList = new ArrayList<String>();

    private BufferedReader bufferedReader = null;

    public List<String> readFile(String path) {
        System.out.println("-----------ReadFile Start---------");
        File file = new File(path);
        String linetxt = null;
        if(!file.exists()) {
            System.out.println("-----------File Not Exist-----------");
            return lineList;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((linetxt = bufferedReader.readLine()) != null) {
                lineList.add(linetxt);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------ReadFile End-----------");
        return lineList;
    }
}
