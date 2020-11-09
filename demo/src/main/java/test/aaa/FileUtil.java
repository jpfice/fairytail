package test.aaa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {



    public static List<String> txt2String(File file){
        List<String> resultList = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                resultList.add(s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultList;
    }


    public static void getErrorNumber(File file){
        //List<String> resultList = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){

                int start = s.indexOf("ItemQuery");
                if (start != -1) {
                    int end  = s.indexOf("is");
                    System.out.println((s.substring(start+9, end)).trim());
                }
                //resultList.add((s.substring(start+9, end)).trim());
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }




}
