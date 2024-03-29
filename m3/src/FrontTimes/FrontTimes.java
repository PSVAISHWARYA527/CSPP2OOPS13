/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the 
 * string is less than length 3. Return n copies of the front;
 * 
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 * 
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 * 
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 * 
 * @author: Siva Sankar
 */
package FrontTimes;
public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        //  Your code goes here....
         String res="";
         if (str.length()<3 || str==""){
             for(int i=0;i<n;i++){
             res= res+str;
             }
         }
         if (str.length()>=3){

        str= str.substring(0,3); 
        while(n!=0){
            res=res+str;
            n=n-1;
        }

       

    }
    return res;
    }
}