class ReplaceMutipleMIdSpacesWithSingleSpace{
    public static void main(String[] args) {
      String s = "AWadh     Kishor     Singh";
      char[] ch = s.toCharArray();
      int n = s.length();
      s = "";
      for(int i =0; i<n ; i++){
        if(s.isEmpty()){
            s+=ch[i];
        }
        else if(s.charAt(s.length()-1)==' '&&ch[i]==' '){
            continue;
        }
        else{
            s+=ch[i];
        }
      }
      System.out.println(s);
    }
}
