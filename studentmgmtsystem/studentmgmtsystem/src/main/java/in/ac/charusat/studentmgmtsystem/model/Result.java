package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    private Integer student_id;

    private Integer course_id;

    private Integer result_id;
    private Integer marks;


    public Result(Integer student_id, Integer course_id, Integer result_id, Integer marks) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.result_id = result_id;
        this.marks = marks;
    }

    public Result() {

    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getResult_id() {
        return result_id;
    }

    public void setResult_id(Integer result_id) {
        this.result_id = result_id;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
