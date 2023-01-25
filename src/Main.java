public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName+middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();
        String fullNameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameBig);
        System.out.println();
        String fullName1 = "Иванов Семён Семёнович ";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}