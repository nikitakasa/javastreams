import java.util.stream.*;
import java.util.*;
import java.io.*;
class Streams
{
    public List<String> search(List<String> list) {
 return list
 .stream()
 .filter(s -> s.startsWith("a") && s.length()==3)
 .collect(Collectors.toList());
}


 public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.print("no of strings in list :");
     int n=sc.nextInt();
     String j;
     ArrayList l=new ArrayList();
     for(int i=0;i<=n;i++)
     {  j=sc.nextLine();
         l.add(j);
     }
    Main m=new Main();
    System.out.println("List after removing 'a' of size 3 : "+m.search(l));
    
 }

}