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
