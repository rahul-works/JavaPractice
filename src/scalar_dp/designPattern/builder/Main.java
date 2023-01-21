package scalar_dp.designPattern.builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder()
                .setId(1)
                .setPsp(81)
                .setName("Neha")
                .setGradYear(2018)
                .setYoe(4)
                .setAge(24).build();
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
