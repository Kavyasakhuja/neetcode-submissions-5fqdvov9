class Solution {

    public String encode(List<String> strs) {
        String result="";
        for(String s:strs){
            int length= s.length();
            result= result + length +"#" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) !='#'){
                j++;
            }
            String len=str.substring(i,j);
            int length=Integer.parseInt(len);

            i=j+1;
            String word=str.substring(i,i+length);
            result.add(word);
            i=i+length;
        }
        return result;
        
    }
}
