/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben kollen
 */
public class hoi9 {
        public static void main(String[] args) {
	student st1 = new student("Betram", 3434);
	student st2 = new student("Djamel",34334);
	student st3 = new student("Ruben",33434);
	student st4 = new student("Jeroen", 3434);
	System.out.println("Naam:"+st1.getNaam()+"\nStudentnummer:"+st1.getStudentnummer());
	System.out.println("Naam:"+st2.getNaam()+"\nStudentnummer:"+st2.getStudentnummer());
	System.out.println("Naam:"+st3.getNaam()+"\nStudentnummer:"+st3.getStudentnummer());
	System.out.println("Naam:"+st4.getNaam()+"\nStudentnummer:"+st4.getStudentnummer());    
}
}