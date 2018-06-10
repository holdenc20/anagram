package anagram;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class anagram {
	public static boolean test(char[] x) {
		for(int i=0;i<x.length;i++) {
			if(x[i]!='ß') {
				return false;
			}
		}
		return true;
		
	}
public static void main(String[] args) {
	boolean done=false;
	while(done==false) {
	ArrayList<char[]> dict=new ArrayList<char[]>();
	try {
		Scanner ss =new Scanner(new File("src/anagram/dictionary.txt"));
		while(ss.hasNext()) {
			String temp=ss.nextLine();
			dict.add(temp.toCharArray());
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	Scanner s = new Scanner(System.in);
	

	System.out.println("enter word");
	String word=s.nextLine();
	char[] letters=word.toCharArray();
	for(int x=0;x<dict.size();x++) {
		letters=word.toCharArray();
		char[] holder= {'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a'};
		for(int g=0;g<dict.get(x).length;g++) {
			holder[g]=dict.get(x)[g];
		}
		if(dict.get(x).length==letters.length) {
		for(int a=0;a<letters.length;a++) {
			for(int b=0;b<dict.get(x).length;b++) {
				if(letters[a]==dict.get(x)[b] && letters[a]!='ß') {
					letters[a]='ß';
					dict.get(x)[b]='ß';
				}
				if(test(letters)==true) {
					for(int g=0;g<dict.get(x).length;g++) {
						System.out.print(holder[g]);
					}
					System.out.println();
				}
			}
		}
	}
	}
	}
}
}
