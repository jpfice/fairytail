package common;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Test {

    public static void main(String[] args) {

        Test ts = new Test();


    }

    public String chinaToUnicode(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int chr1 = (char) str.charAt(i);
            if (chr1 >= 19968 && chr1 <= 171941) {// 汉字范围 \u4e00-\u9fa5 (中文)
                result += "\\u" + Integer.toHexString(chr1);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public String string2Unicode(String string) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            unicode.append("\\u" + Integer.toHexString(c));
        }
        return unicode.toString();
    }



    public String toMD5(String str) {

        String salt = "123";
        String md5 = new Md5Hash(str, salt, 2).toString();

        return md5;
    }




}
