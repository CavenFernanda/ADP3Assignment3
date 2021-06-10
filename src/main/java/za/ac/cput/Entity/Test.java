package za.ac.cput.Entity;

import java.time.LocalDate;

/*
Test.java
Entity for Test
Author: Athi Fukama 218328591
Date :11 June 2021
 */
public class Test {
    private String testID;
    private String lecturerID;
    private String testInfo;
    private LocalDate testDate;

    private Test(Test.Builder builder) {
        this.testID = builder.testID;
        this.lecturerID = builder.lecturerID;
        this.testInfo = builder.testInfo;
        this.testDate = builder.testDate;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testID + '\'' +
                ", lecturerID='" + lecturerID + '\'' +
                ", testInfo='" + testInfo + '\'' +
                ", testDate=" + testDate +
                '}';
    }

    // Builder Class
    public static class Builder {
        private String testID;
        private String lecturerID;
        private String testInfo;
        private LocalDate testDate;


        public Builder setTestID(String testID) {
            this.testID = testID;
            return this;
        }

        public Builder setLecturerID(String lecturerID) {
            this.lecturerID = lecturerID;
            return this;
        }

        public Builder setTestInfo(String testInfo) {
            this.testInfo = testInfo;
            return this;
        }

        public Builder setTestDate(LocalDate testDate) {
            this.testDate = testDate;
            return this;
        }

        public Test build() {
            return new Test(this);

        }

        public Test.Builder copy(Test test) {
            this.testID = test.testID;
            this.lecturerID = test.lecturerID;
            this.testInfo = test.testInfo;
            this.testDate = test.testDate;

            return this;
        }

        public String getTestID() {
            return testID;
        }

        public String getLecturerID() {
            return lecturerID;
        }

        public String getTestInfo() {
            return testInfo;
        }

        public LocalDate getTestDate() {
            return testDate;
        }
    }
}