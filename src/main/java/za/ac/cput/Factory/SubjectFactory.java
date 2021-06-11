package za.ac.cput.Factory;

import za.ac.cput.Entity.Subject;
/**
 * Subject.java
 * Entity for Subject
 * Author: Mathew Fortuin (219069514)
 * Date: 10/6/21
 *
 */



public class SubjectFactory
{

    public static Subject build(String subjectName,String subjectCredits,String subjectID,String lecturerID)
    {
        //Condition for the object

        if(subjectName.isEmpty() || subjectCredits.isBlank())
        {
            return new Subject.Builder()
                    .subjectName("PHP Fundamentals")
                    .subjectCredit("NQF36")
                    .build();
        }

        else
        {
            return new Subject.Builder()

                    .build();
        }
    }

}
