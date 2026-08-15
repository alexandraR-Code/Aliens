package com.krakedev.alien.test;

import com.krakedev.alien.Aliens;

public class TestConstructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========================================");
		Aliens aliens1 = new Aliens(10, "verde");
		aliens1.imprimir();
		System.out.println("==========================================");
		Aliens aliens2 = new Aliens(4, "rosa");
		aliens2.imprimir();
		System.out.println("==========================================");
		Aliens aliens3 = new Aliens(45, "Azul");
		aliens3.imprimir();
	}
}
