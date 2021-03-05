import java.util.*;
import java.io.*;
public class PrintKeypaid {
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printkpc(str,"");
    }
    static String []codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkpc(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);

        String codesofchar=codes[ch-'0'];
        for(int i=0;i<codesofchar.length();i++){
            char choption=codesofchar.charAt(i);
            printkpc(roq,ans+choption);
        }
    }
}
