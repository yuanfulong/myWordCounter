import java.io.*;
import java.lang.*;
public class WordCounterbz{
    public String charCounter (String filename){
        String resultc;
        int charcount = 0;
        
        FileInputStream fin;
        fin = new FileInputStream(filename);
        
        int i = fin.read();
        while(i != -1){
            charcount += aline.length();//这一行几个字符就给字符计算加几
        }
       
        resultc = charcount + "";
        return resultc;
    }
    public String lineCounter (String filename){
        String resultc;
        int linecount = 0;
        BufferedReader bf;
        FileReader finr;
        finr = new FileReader(filename);
        bf = new BufferedReader(fin);
        String aline = bf.readLine();
        while(aline != null){
            linecount += 1;//得出行数
        }
        bf.close();//关闭流
        resultc = linecount + "";
        return resultc;
    }

    public String wordCounter (String filename){
        int wordcount = 0;
        String resultw;
        BufferedReader bf;
        FileReader finr;
        finr = new FileReader(filename);
        bf = new BufferedReader(fin);
        String aline = bf.readLine();
        while(aline != null){
            String[] word = aline.split(" |.|:|,");
            wordcount += word.length;
        }
        bf.close();//关闭流
        resultw = wordcount + "";
        return resultw;
    }
}


public class WordCounter {
    public static void main(String[] args) {
        String a1 = args[0];
        String a2 = args[1];
        
        String result = null;
        WordCounterbz wc = new WordCounterbz();
        if (args.length == 0) {
            result = "usage: java WordCounter [options] [input_file]";//失败的那句话
        }
        if (args.length == 1 || !a1.contains("-")) {
            wc.charCounter(a1);
            wc.wordCounter(a1);
            wc.lineCounter(a1);
            result = wc.charCounter(a1) + "|" + wc.wordCounter(a1) + "|" + wc.lineCounter(a1) + "|" + a1;
        }
        if (a1.contains("-") || args.length == 1) {
            result = "usage: java WordCounter [options] [input_file]";//失败的那句话
        }
        boolean lt = a1.contains("l");
        boolean wt = a1.contains("w");
        boolean ct = a1.contains("c");
        if (args.length == 2) {
            wc.charCounter(a2);
            wc.wordCounter(a2);
            wc.lineCounter(a2);
            if (lt) {
                result += wc.charCounter(a1) + "|";
            }
            if (wt) {
                result += wc.wordCounter(a1) + "|";
            }
            if (ct) {
                result += wc.lineCounter(a1) + "|";
            }
            result += a2;
        } //这样三种结果不论有哪一种都能够按照lwc的顺序输出
        System.out.print(result);
    }
}
