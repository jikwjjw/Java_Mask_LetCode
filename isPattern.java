链接：https://www.nowcoder.com/questionTerminal/42852fd7045c442192fa89404ab42e92
来源：牛客网

//这题就暴力扫一遍就可以了，碰到3个连续的或者AABB删掉那个字符即可。。。
//当时没做出来。。。菜是原罪！
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder(sc.nextLine());
                for(int j = 2; j < sb.length(); j++){
                    if(sb.charAt(j) == sb.charAt(j - 1) 
                       && sb.charAt(j - 1) == sb.charAt(j - 2)){
                        sb.deleteCharAt(j);
                        j--;
                    }
                    else if(isPattern(sb, j - 3, j)){
                        sb.deleteCharAt(j);
                        j--;
                    }
                }
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
    public static boolean isPattern(StringBuilder sb, int i, int j){
        if(i < 0) return false;
        return sb.charAt(i) == sb.charAt(i + 1) &&
                sb.charAt(j - 1) == sb.charAt(j);
    }
}
