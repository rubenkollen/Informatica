/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben kollen
 */
public class student{

	private String studentnaam;
	private int studentnummer;
	
	student(String s){
		studentnaam = s;
	}
	
	student(int i){
		studentnummer = i;
	}
	
	student(String s, int i){
		studentnaam = s;
		studentnummer = i;
	}

	public String getNaam() {
		return studentnaam;
	}

	public void setNaam(String naam) {
		this.studentnaam = naam;
	}
	
	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

}
