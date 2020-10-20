import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str  = str.toLowerCase();
        int vow = 0, con = 0, sp = 0;
        for(int i = 0;i<str.length();i++){
          char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vow;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++con;
            }
            
            else if (ch ==' ')
            {
                ++sp;
            }
        }
        System.out.println("vowels:"+vow+"\tconsonants:"+con+"\tspaces:"+sp);
    }
}
