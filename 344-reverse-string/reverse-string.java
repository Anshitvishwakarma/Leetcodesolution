class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<=j){
            char tem=s[i];
            s[i]=s[j];
            s[j]=tem;
            i++;
            j--;

        }
        String k=new String(s);
        System.out.println(k);
    }
}