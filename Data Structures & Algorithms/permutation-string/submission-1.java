class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if( s1.length()>s2.length()) return false;
        int n1=s1.length();

        int[] a1= new int[26];
        int[] a2= new int[26];

        for(char c: s1.toCharArray()){
            a1[c-'a']++;
        }

        int s=0;
        for(int e=0;e<s2.length();e++){
            a2[s2.charAt(e)-'a']++;

            if(e-s+1>n1){
                a2[s2.charAt(s)-'a']--;
                s++;
            }
            if(e-s+1== n1){
                boolean match= true;
                for(int i=0;i<26;i++){
                    if(a1[i]!=a2[i]){
                        match=false;
                        break;
                    }
                }
                if(match) return true;
            }
        }
        return false;
        
    }
}
