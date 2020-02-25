/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author qa
 */
public class Course {
    private String name; 
    private String codeName; 
    private int numberOfClasses; 
    
    public Course(){
       this.name = "";
       this.codeName = "";
       this.numberOfClasses = 0 ;   
    }
    public Course(String name, String codeName, int numberOfClasses){
       this.name = name;
       this.codeName = codeName;
       this.numberOfClasses = numberOfClasses;  
    }
    
    public String name (){
        return this.name;
}
    public void setName (String customName) {
       this.name = customName;
   }
   
    public String codeName (){
        return this.codeName;
}
    public void setCodeName (String customCodeName) {
       this.codeName = customCodeName;
   }
    public int numberOfClasses(){
        return this.numberOfClasses;
    }
    public void setnumberOfClasses(int customnumberOfClasses){
         this.numberOfClasses = customnumberOfClasses;
   }
}
