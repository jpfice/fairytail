package analyze.Analyze;

import java.util.List;

import org.apache.log4j.Logger;

import analyze.Base.Ifunction;
import analyze.Util.FileUtil;
import analyze.Util.StringUtil;

public class HayisinFunction implements Ifunction {

    private static Logger logger = Logger.getLogger(HayisinFunction.class);
    FileUtil fu = new FileUtil();
    StringUtil su =  new StringUtil();
    String[] flag = {"<",">","[ThreadID:"};
    String path = "C:\\Users\\RJ040050\\Desktop\\性能改善\\配信.txt";
    int[] indexArray = {0,2};

    @Override
    public void analyze() {
        StringBuffer sb = new StringBuffer();
        su.setFlag(this.flag);
        List<String> readLineList = fu.readFile(this.path);

        for (String readLine:readLineList) {
            String[] subStr = su.getSubLog(readLine);
            for(int index: indexArray) {
                sb.append(subStr[index]);
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }



}
