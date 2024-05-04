
public class PermutationString {

    public static  void permutation(String str,String perm){

        if(str.length() ==0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String newstr = str.substring(0,i)  + str.substring(i+1);

            permutation(newstr, perm+ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
