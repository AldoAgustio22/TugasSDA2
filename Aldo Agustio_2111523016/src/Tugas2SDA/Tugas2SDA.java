package Tugas2SDA;

import java.util.LinkedList;

public class Tugas2SDA {
	public static void main(String[] args) {
		LinkedList<String> AldoAgustio = new LinkedList<>();
		
		System.out.println("===============");
		System.out.println("Soal Nomor 1");
		System.out.println("===============");
		// Soal Nomor 1 Add
		AldoAgustio.add("L");
		AldoAgustio.add("D");
		AldoAgustio.add("O");
		
		AldoAgustio.add("A");
		AldoAgustio.add("G");
		AldoAgustio.add("U");
		AldoAgustio.add("S");
		AldoAgustio.add("T");
		AldoAgustio.add("I");
		
		AldoAgustio.addFirst("A");
		AldoAgustio.addLast("O");
		
		System.out.println("Nama Aldo Agustio : "+AldoAgustio);
		
		System.out.println("Jumlah Aldo Agustio :"+AldoAgustio.size());
		
		System.out.println("Aldo Agustio permata : "+AldoAgustio.getFirst());
		
		System.out.println("Aldo Agustio kedua :"+AldoAgustio.getLast());
		
		System.out.println("===============");
		System.out.println("Soal Nomor 2");
		System.out.println("===============");
		
		// Soal Nomor 2
		System.out.println(AldoAgustio.set(4,"A"));
		System.out.println(AldoAgustio.set(1,"L"));
		System.out.println(AldoAgustio.set(2,"D"));
		System.out.println(AldoAgustio.set(3,"O"));
		
		System.out.println("===============");
		System.out.println("Soal Nomor 3");
		System.out.println("===============");
		
		// Soal Nomor 3
		AldoAgustio.remove(3);
		AldoAgustio.remove(4);
		AldoAgustio.remove(2);
		AldoAgustio.remove(3);
		System.out.println("Hapus yang nama saya :"+AldoAgustio);
		
		System.out.println("===============");
		System.out.println("Soal Nomor 4");
		System.out.println("===============");
		
		// Soal Nomor 4
		AldoAgustio.pop();
		System.out.println("Isi yang diupdate POP"+AldoAgustio);
		AldoAgustio.push("A");
		System.out.println("isi yang diupdate PUSH"+AldoAgustio);
	}

}