package com.kc.lambda1;

public class Lambda1 {

	public static void main(String[] args) {
		System.out.println("Lambda 1");
		Anime anime = (String animeName)->System.out.println("The anime name is :"+ animeName);
		Lambda1.diplayAnimes(anime);
	}
	
	public static void diplayAnimes(Anime anime) {
		anime.printAnAnimeName("code geass");
		anime.printAnAnimeName("cow boy bebop");
	}

}
