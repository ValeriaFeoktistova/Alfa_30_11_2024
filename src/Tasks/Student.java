// 2. Задание:
// Создайте класс "Студент" с полями для имени, возраста и среднего балла. Напишите методы для установки и получения значений полей,
// а также метод для вывода информации о студенте.

package Tasks;

public class Student {
    private String name;
    private byte age;
    private double averageGrade;

    public Student(String name, byte age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше 0.");
        }
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0 && averageGrade <= 10) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("Средний балл должен быть в диапазоне от 0 до 10.");
        }
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", (byte) 20, 8.5);

        student.displayInfo();

        student.setName("Мария Смирнова");
        student.setAge((byte) 22);
        student.setAverageGrade(9.2);

        student.displayInfo();
    }
}


