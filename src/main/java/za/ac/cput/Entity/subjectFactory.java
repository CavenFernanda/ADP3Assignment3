package za.ac.cput.Entity;


/**
 * Subject.java
 * Entity for Subject
 * Author: Mathew Fortuin (219069514)
 * Date: 6/6/21
 *
 */
public class subjectFactory
{

public Subject getInstance(String str)
{
    Subject
    if(str.equals("getSubInfo"))
    {
        return new getSubjectInformation();
    }
}

}
