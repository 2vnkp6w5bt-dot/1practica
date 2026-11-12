package mirea.lab2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private int iDNumber;
    private double gpa;
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private Date birthDate;

    public Student(String firstName, String lastName, String major, int course, String group, int iDNumber, double gpa, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public Student(String firstName, String lastName, String major, int course, String group, int iDNumber, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.birthDate = null;
    }

    public double getGpa() {
        return gpa;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Date getBirthDate() {
        return birthDate;
    }


    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getFormattedBirthDate(int style) {
        if (birthDate == null) {
            return "Дата рождения не указана";
        }
        Locale rulocale = new Locale("ru", "RU");
        DateFormat df = DateFormat.getDateInstance(style, rulocale);
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String bDay;
        if (birthDate == null) {
            bDay = "неизвестно";
        } else {
            bDay = sdf.format(birthDate);
        }

        return String.format("Студент: %s %s | Спец: %s | Курс: %d | Группа: %s | ID: %d | GPA: %.2f | Дата рождения: %s",
                lastName, firstName, major, course, group, iDNumber, gpa, bDay);
    }
}
