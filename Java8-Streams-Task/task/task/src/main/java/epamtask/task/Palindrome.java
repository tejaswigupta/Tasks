package epamtask.task;

import java.util.ArrayList;
import java.util.function.*;
import java.util.List;

public class Palindrome {

	public static void main(String args[])
	{
		List<String> str=new ArrayList<String>();
		str.add("aba");
		str.add("abc");
		Function<List,List> p=Palin::palindrome;
		System.out.println(p.apply(str));
	}
}
class Palin{
	static List<String> palindrome(List<String> str1)
	{
		int count; 
		List<String> s=new ArrayList<>();
		for(String i:str1){
			count=0;
			for(int j=0;j<i.length()/2;j++) {
				if(i.charAt(j)==i.charAt(i.length()-1-j))count++;
			}
			if(count==i.length()/2)s.add(i);//=s+i+" ";
		}
		return s;
	}
}


