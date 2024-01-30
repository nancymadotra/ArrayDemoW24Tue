/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemow24tue;

/**
 *
 * @author 91935
 */
public class PartTimeStudent extends Student{
    private int numOfCourse;

    /**
     * @return the numOfCourse
     */
    public int getNumOfCourse() {
        return numOfCourse;
    }

    public PartTimeStudent(int numOfCourse, int sid, String sname) {
        super(sid, sname);
        this.numOfCourse = numOfCourse;
    }
    

    /**
     * @param numOfCourse the numOfCourse to set
     */
    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }
    
    
}
