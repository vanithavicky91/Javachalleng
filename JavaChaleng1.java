package javachallenge1;

import java.util.ArrayList;
import java.util.List;

public class JavaChaleng1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="uffy is still joyboy";
String[] strArray=str.split(" ");
//declare a list add the string intp list
List<String> list=new ArrayList<String>();
for(int i=0;i<strArray.length;i++)
{
	list.add(strArray[i]);
}
System.out.println(list);
String lastword=list.get(strArray.length-1);
System.out.println("last word in the string:"+lastword);
System.out.println("length of the last word:"+lastword.length());

	}

}
