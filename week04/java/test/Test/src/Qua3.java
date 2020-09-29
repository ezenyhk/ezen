

class Qua3 {
    public static void main(String args[]) {
        Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}

class Student {
    private String name;
    private int classNumber;
    private int studentNumber;
    private int kor;
    private int math;
    private int eng;

    private double avg;
    private String formattedAvg;

    public Student(String name, int classNumber, int studentNumber, int korean, int math, int eng) {
        this.name = name;
        this.classNumber = classNumber;
        this.studentNumber = studentNumber;
        this.kor = korean;
        this.math = math;
        this.eng = eng;
    }

    public String info() {
        String result = "";
        result += name + ","
                + classNumber + ","
                + studentNumber + ","
                + kor + ","
                + math + ","
                + eng + ","
                + getTotal()
                + "," + getAverage();
        return result;
    }

    public int getTotal() {
        return kor + math + eng;
    }

    public double getAverage() {
        return Math.round(getTotal() / 3.0 * 10) / 10.0;
    }

}