package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<User> course = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int na = sc.nextInt();
		for(int i = 0; i < na; i++) {
			int cod = sc.nextInt();
			course.add(new User(cod));
		}
		
		System.out.print("How many students for course B? ");
		int nb = sc.nextInt();
		for(int i = 0; i < nb; i++) {
			int cod = sc.nextInt();
			course.add(new User(cod));
		}
		
		System.out.print("How many students for course C? ");
		int nc = sc.nextInt();
		for(int i = 0; i < nc; i++) {
			int cod = sc.nextInt();
			course.add(new User(cod));
		}
		
		System.out.println("Total students: " + course.size());
		
		sc.close();
	}

}
