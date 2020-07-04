package epamtask.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	public static void main(String args[]) throws IOException{
		List<String> arr=new ArrayList<String>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(reader.readLine());
		for(int i=0;i<size;i++)
		{
			arr.add(reader.readLine());
		}
		List<String> filtered= arr.stream().filter(string->string.startsWith("A") && string.length()==3).collect(Collectors.toList());
		System.out.println(filtered);
		}
}
