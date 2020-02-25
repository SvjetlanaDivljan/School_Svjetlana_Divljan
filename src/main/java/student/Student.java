/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
    private String firstName; 
    private String lastName; 
    private int yearOfBirth; 
    
    public Student(){
       this.firstName = "Petar";
       this.lastName = "Petrovic";
       this.yearOfBirth = 1990 ;
    }
    
    public Student(String firstName, String lastName, int yearOfBirth){
       this.firstName = firstName;
       this.lastName = lastName;
       this.yearOfBirth = yearOfBirth;  
    }
    
    public String firstName (){
        return this.firstName;
}
    public void setFirstName (String customFirstName) {
       this.firstName = customFirstName;
   }
   
    public String lastName (){
        return this.lastName;
}
    public void setLastName (String customLastName) {
       this.lastName = customLastName;
   }
    public int yearOfBirth(){
        return this.yearOfBirth;
    }
    public void setYearOfBirth(int customYearOfBirth){
         this.yearOfBirth = customYearOfBirth;
   }
 
    public void Info() {
        System.out.println("Ime: " + this.firstName());
        System.out.println("Prezime: " + this.lastName ());
        System.out.println("Godina rodjenja: " + this.yearOfBirth ());
    }
}
