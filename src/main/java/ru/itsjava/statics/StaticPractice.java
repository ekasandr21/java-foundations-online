package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {
        // System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);
/*

        Salary cleanladySalary = new Salary(5_000.0);
        Salary targetologSalary = new Salary(10_000.0);

        System.out.println("cleanladySalary.getFullSalary() = " + cleanladySalary.getFullSalary());
        System.out.println("targetologSalary.getFullSalary() = " + targetologSalary.getFullSalary());

        Salary.setIncreaseCoefficient(1.0);

        System.out.println("cleanladySalary.getFullSalary() = " + cleanladySalary.getFullSalary());
        System.out.println("targetologSalary.getFullSalary() = " + targetologSalary.getFullSalary());
        System.out.println("Salary.CEO = " + Salary.CEO);
*/


        //Смотрю, что стоимость статик распростроняется на любую марку машины в этом классе

        Car bmv = new Car("BMV", "black");
        Car lada = new Car("Lada", "Red");
        //чтобы посмотреть на cost, я сделал его public,
        //но можно обыло через getCost
        //и это будет правильнее я это понимаю, просто в рамках этого урока
        //хотя прописать @Data не сложно было бы
        System.out.println("bmv.cost = " + bmv.cost);
        System.out.println("lada.cost = " + lada.cost);
        System.out.println();
        Circle circle = new Circle(13);

    }
}
