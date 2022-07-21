class Employee {
    int salary;
    public void set_salary (int salary) {
        this.salary = salary;
    }
}
class Doctor extends Employee {
    public void diagnose() {
        System.out.println ("Doctor is diagnosing.");
    }
}
class Nurse extends Employee {
    public void care() {
        System.out.println ("Nurse is caring.");
    } 
}
class Administrator extends Employee {
    public void budget() {
        System.out.println ("Administrator is budgeting.");
    }
}
class Surgeon extends Doctor {
    public void operate() {
        System.out.println ("Surgeon is operating.");
    }
}
class Receptionist extends Employee {
    public void type() {
        System.out.println ("Receptionist is typing.");
    }
    public void call() {
        System.out.println ("Receptionist is calling.");
    }
}
class Janitor extends Employee {
    public void clean() {
        System.out.println ("Janitor is cleaning.");
    }
}

public class Prgm8a {
    public static void main (String[] args) {
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Administrator administrator = new Administrator();
        Surgeon surgeon = new Surgeon();
        Receptionist receptionist = new Receptionist();
        Janitor janitor = new Janitor();
        doctor.diagnose();
        nurse.care();
        administrator.budget();
        surgeon.diagnose();
        surgeon.operate();
        receptionist.type();
        receptionist.call();
        janitor.clean();
    }
}
