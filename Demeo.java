public class Demeo {
    
    /**
     * 转二进制
     * @param str
     * @return
     */
    private static String toBinaryString(String str) {
        char[] b=str.toCharArray();
        String res="二进制数字";
        for (char c : b) {
            res+=Integer.toBinaryString(c)+" ";
        }
        return res;
    }

    /**
     * 二进制转字符
     * @param binary
     * @return
     */
    public static String toString(String binary) {
        String[] tempStr=binary.split(" ");
        String s="";
        for (String str : tempStr) {
            s+=Character.toString((char)(Integer.parseInt(str,2)));
        }
        return s;
   }
    
    public static void main(String[] args) {
        String s=toBinaryString("");
        System.out.println(s);
        System.out.println(toString(s));
    }

}