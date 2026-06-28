class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        for(int i=97;i<123;i++){
            int sc=0,tc=0;
            for(int j=0;j<s.length();j++){
                if((char)i==s.charAt(j))sc++;
                if((char)i==t.charAt(j))tc++;
            }
            if(sc!=tc)return false;
        }
        return true;
    }
}
