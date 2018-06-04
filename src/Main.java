
import loops.Loops;
import person.Person;
import person.Student;


public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printAttributes();
//        myCar.changeLicense("efg123");
////double distance = myCar.maxDistance();
////System.out.println("Maksimalna distanca je: " + distance);
//       
//         Car audi = new Car("Audi", 50, 2);
//         audi.printAttributes();
////         audi.changeLicense("zcv345");
////         audi.printAttributes();
//         
////         System.out.println("Maksimalna distanca je: " + audi.maxDistance());
//audi.fuelUp();
//audi.printAttributes();
//audi.travel(20);
//audi.printAttributes();
//audi.travel(30);
//audi.printAttributes();
//Car noviAuto = new Car("Novi auto", 100, 3, 4, 1);
//noviAuto.printAttributes();
//noviAuto.getIn();
//noviAuto.getIn();
//noviAuto.getIn();
//noviAuto.getIn();
//noviAuto.getIn();
//noviAuto.getIn();
//noviAuto.printAttributes();
//
//noviAuto.getOut();
//noviAuto.getOut();
//noviAuto.getOut();
//noviAuto.getOut();
//noviAuto.getOut();
//noviAuto.getOut();
//noviAuto.printAttributes();
//Car noviAuto = new Car();
////noviAuto.printAttributes();
//
//noviAuto.getIn(3);
//noviAuto.printAttributes();
//noviAuto.getIn(1);
//noviAuto.printAttributes();
//
//noviAuto.getOut(3);
//noviAuto.printAttributes();
//noviAuto.getOut(5);
//noviAuto.printAttributes();
//        int x = 5;
//        while (x > -4) {
//            System.out.println(x);
//            x--;//x = x -1;
//
//        }
//        do {
//            System.out.println(x);
//            x--;
//        } while (x > 0);

//        for (int i = 7; i < 15; i++) {
//            System.out.println(i);
//        }
        
//Loops loop1 = new Loops();
//loop1.testWhileLoop();

//Loops.testWhileLoop();
//Loops.testForLoop();
//Loops.testDoubleForLoop();
//
//Loops.printCoordinates();

Person osoba = new Person();


osoba.setName("Vladimir");
osoba.setSurname("Zdravkovic");

osoba.showData();


        Student studentPetar = new Student("Petar","Petrovic", "393993939393");
        
        studentPetar.showData();
        
        Student studentMarko = new Student("Marko", "Markovic", "2348289842", "oas123", 2);
        studentMarko.showData();
//        System.out.println(osoba.getName());
//        System.out.println(osoba.getSurname());
//        System.out.println(osoba.getJmbg());
    }

}
