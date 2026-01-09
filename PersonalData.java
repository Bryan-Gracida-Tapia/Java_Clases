package ConectionsDB;

/**
 *
 * @author ryangt
 */
public class PersonalData {
    private String name;
    private int age;
    private String curp;
    private String date;

    public PersonalData(String name, int age, String curp, String date) {
        this.name = name;
        this.age = age;
        this.curp = curp;
        this.date = date;
    }
    
    public void ViewData(){
        System.out.println("nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("curp: " + curp);
        System.out.println("fecha nacimiento: " + date);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
