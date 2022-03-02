package lhq.train.Offer50;

import com.sun.deploy.util.StringUtils;

public class Test {
    public char firstUniqChar(String s) {
        if(s == null || s.equals("")){
            return ' ';
        }
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return c;
            }
        }
        return ' ';
    }

}
