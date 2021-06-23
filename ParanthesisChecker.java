package string;
class ParanthesisChecker{
  void check(String S){
    char [] A= S.toCharArray();
    int len= A.length;
    int o=0,z=0;
    String s="";
    if ((A[len-1]=='(' || A[len-1]=='[' || A[len-1]=='{') || (A[0]==')' || A[0]==']' || A[0]=='}')) System.out.println("no");
    else {
      for (int i=0;i<len;i++){
        if (((A[i]=='(')&&(A[i+1]==')'))||((A[i]=='[')&&(A[i+1]==']'))||((A[i]=='{')&&(A[i+1]=='}'))){
          o=i;
          z++;
        }
      }
      if (z!=0){
        for (int i=0;i<len;i++){
          if (i!=o && i!=o+1) s=s+A[i];
        }
        if (s.length()==0) System.out.println("Yes");
        else if(s.length()!=0) check(s);
      }
      else System.out.println("No");
    }
  }
}