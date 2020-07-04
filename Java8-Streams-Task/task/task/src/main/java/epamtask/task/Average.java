package epamtask.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Average {
	public static void main(String args[]) throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int x=Integer.parseInt(n);
		List<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<x;i++)
		{
			arr1.add(Integer.parseInt(reader.readLine()));
		}
		IntSummaryStatistics stats=arr1.stream().mapToInt((s)->s).summaryStatistics();
		System.out.println("Average:"+stats.getAverage());
	}

}


