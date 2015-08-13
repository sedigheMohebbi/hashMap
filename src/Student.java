
public class Student implements Comparable<Student > {
    private String name;
    private Integer Average;

    public Student(String name, Integer average) {
        this.name = name;
        Average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAverage() {
        return Average;
    }

    public void setAverage(Integer average) {
        Average = average;
    }

    @Override
    public int compareTo(Student student) {
        return  this.getAverage().compareTo(student.getAverage());
    }
    public String toString(){
        return getName()+" "+getAverage();
    }

}
