package models.implementations;

import models.ICourse;
import models.SSObject;
import models.SemesterSeasons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course implements ICourse {

    private String courseName;
    private String courseTitle;
    private String courseID;


    private List<String> prerequisites;
    private String courseSubject;
    private String courseCatalog;

    private int creditUnits;
    private String academicCareer;



    private List<ICourse> prereq;


    public Course(){}

    public Course(String courseName, String courseTitle, String courseID, List<String> prerequisites, String courseSubject, String courseCatalog, int creditUnits, String academicCareer) {
        this.courseName = courseName;
        this.courseTitle = courseTitle;
        this.courseID = courseID;
        this.prerequisites = prerequisites;
        this.courseSubject = courseSubject;
        this.courseCatalog = courseCatalog;
        this.creditUnits = creditUnits;
        this.academicCareer = academicCareer;

        this.prereq = new ArrayList<ICourse>();
    }

    public List<ICourse> getPrereq() {
        return prereq;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseTitle() {
        return null;
    }

    public String getCourseID() {
        return "";
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public String getCourseCatalog() {
        return courseCatalog;
    }

    public int getCreditUnits() {
        return 0;
    }

    public String getAcademicCareer() {
        return null;
    }

    public SemesterSeasons[] getCourseAvailability() {
        return null;
    }

    public SemesterSeasons[] getEngineerAvailability() {
        return null;
    }

    @Override
    public String toString(){

        String[] info = new String[prerequisites.size()];
        info = prerequisites.toArray(info);

        return courseSubject + "" + courseCatalog + "; " + Arrays.toString(info);
    }
}