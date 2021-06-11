package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    @Test
    public void createStudent(){
        Student student = StudentFactory.createStudent("Athi","Fukama","athif@gmail.com","547S");
        System.out.println(student);
    }

}