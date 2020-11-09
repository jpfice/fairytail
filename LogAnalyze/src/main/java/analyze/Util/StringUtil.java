package analyze.Util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class StringUtil {

    private static Logger logger = Logger.getLogger(StringUtil.class);

    private String[] flag = {"<",">","[ThreadID:"};

    private int size = 0;

    private List<Integer> indexList = new ArrayList<Integer>();

    public String[] getSubLog(String readLine) {

        String[] subLog = new String[this.size + 1];

        this.indexList.clear();
        indexList.add(0);
        for(int i=0; i< this.flag.length; i++) {
            if ((readLine.indexOf(this.flag[i])) != -1) {
                indexList.add(readLine.indexOf(this.flag[i]));
            }
        }
        indexList.add(readLine.length());
        for(int j=0; j<indexList.size(); j++) {
            if (j==0) {
                subLog[j] = (readLine.substring(0, indexList.get(j+1))).trim();
                continue;
            }
            if ((j+1) < indexList.size() ) {
                subLog[j] = (readLine.substring(indexList.get(j) + 1, indexList.get(j+1))).trim();
            }
        }
        return subLog;
    }

    public void setFlag(String[] flag) {
        this.flag = flag;
        this.size = flag.length;
    }

}
