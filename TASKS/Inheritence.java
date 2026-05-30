/* 
class Main {
        public void method(int a) {
            System.out.println(a);
        }
        public void method2(int b) {
            System.out.println(b);
        }
    }
    class Inheritence extends Main {
        public static void main(String[] args) {
            Inheritence obj=new Inheritence();
            obj.method(45);
            obj.method2(18);
        }
    }
*/

class Employee {
    void name(String name) {
        System.out.println("Employee Name: "+name);
    }
    void Role(String role,int salary) {
        System.out.println("Role :"+role);
        System.out.println("Salary for developer :"+salary);
    }
}
class Inheritence extends Employee {
    public static void main(String[] args) {
        Inheritence obj=new Inheritence();
        obj.name("Zenitsu");
        obj.Role("Developer",90000);
        obj.name("Nezuko");
        obj.Role("Tester",100000);
                
        }
}






    