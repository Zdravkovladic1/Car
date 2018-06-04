package person;


public class Teacher extends Person {
    
    private String mainSubject;
    private int yearsOfExperiance;
    private String gender;

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Teacher(String name, String surname, String jmbg, String mainSubject, int yearsOfExpiriance, String gender){
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearsOfExperiance = yearsOfExpiriance;
        this.gender = gender;
        
    }



    @Override
    public void showData(){
        super.showData();
        System.out.println("Predmet: " + getMainSubject());
        System.out.println("Godina iskustva: " + getYearsOfExperiance());
        System.out.println("Pol: " + getGender());
    } 
    
}
