package ioPackage;

import java.io.File;
import java.util.Scanner;
public class ReadFile {
private Scanner x;
public void OpenFile(){
try{
x=new Scanner(new File("C:\\Users\\haren\\Desktop\\Harendra.txt"));
}
catch(Exception e){
System.out.println("Could not find the file");
}
}
public void ReadFile(){
while(x.hasNext()){
String a = x.next();
String b = x.next();
String c = x.next();
System.out.println(a+" "+ b+" " + c);
}
}
public void CloseFile(){
x.close();
}
}