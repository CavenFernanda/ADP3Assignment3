package za.ac.cput.Factory;

import za.ac.cput.Entity.Student;
import za.ac.cput.Entity.Test;
import za.ac.cput.Util.GenericHelper;


public class TestFactory {
    public static Test createTest(String lecturerID,String testInfo){
       String testNo = GenericHelper.generateID();
        Test test = new Test.Builder()
                .setTestID(testNo)
                .setLecturerID(lecturerID)
                .setTestInfo(testInfo).build();

        return test;
    }
}
