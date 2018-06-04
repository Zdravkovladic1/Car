package person;

public class Person {

    private String name;
    private String surname;
    private String jmbg;

    public Person() {
        this.name = "Ime";
        this.surname = "Prezime";
        this.jmbg = "1234567891234";
        
    } 

    public Person(String Name, String Surname, String Jmbg) {

        this.name = Name;
        this.surname = Surname;
        this.jmbg = Jmbg;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    public void showData(){
        System.out.println(this.getName());
        System.out.println(this.getSurname());
        System.out.println(this.getJmbg());
        
    }

}
