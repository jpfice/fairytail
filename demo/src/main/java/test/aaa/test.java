package test.aaa;

import java.io.File;

public class test {

    public static void main(String[] args) {

//        long time = 1694379;
//
//        System.out.println(Math.round(time/1000) + "Miao");
//
//        System.out.println((Math.round((time/1000)/60)) + "Fen");
//
//
//        int yu = 9996%6;
//
//        System.out.println(yu);


//        File file = new File("C:\\Users\\RJ040050\\Desktop\\111.txt");
//
//        List<String> res = FileUtil.txt2String(file);
//
//        int size = res.size();
//
//        for (int i=0; i< size; i++) {
//            System.out.println(res.get(i));
//        }


        File file = new File("C:\\Users\\RJ040050\\Desktop\\111.txt");
        FileUtil.getErrorNumber(file);



    }

}
