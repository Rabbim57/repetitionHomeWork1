public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(" Собака " + dog + " Кошка " + cat + " Бумага " + paper);
        /// Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(" Собака " + dog + " Кошка " + cat + " Бумага " + paper);
        /// Задача 3
        var reducedog = dog - 3.5;
        var reducecat = cat - 1.6;
        var reducepaper = paper - 7639;
        System.out.println(" Собака " + reducedog + " Кошка " + reducecat + " Бумага " + reducepaper);
        /// Задача 4
        var friend = 19;
        System.out.println(" Друзья " + friend);
        friend = friend * 2;
        System.out.println(" Друзья " + friend);
        friend = friend / 7;
        System.out.println(" Друзья " + friend);
        /// Задача 5
        var frog = 3.5;
        System.out.println(" лягушка " + frog);
        frog = frog * 10;
        System.out.println(" лягушка " + frog);
        frog = frog / 3.5;
        System.out.println(" лягушка " + frog);
        frog = frog + 4;
        System.out.println(" лягушка " + frog);
        /// Задача 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var boxerWeight = firstBoxer + secondBoxer;
        System.out.println(" Вес первого боксера " + firstBoxer);
        System.out.println(" Вес второго боксера " + secondBoxer);
        System.out.println(" Общий вес боксеров" + boxerWeight);
        var differenceBetweenBoxers = firstBoxer - secondBoxer;
        System.out.println(" Разница между боксерами " + differenceBetweenBoxers);
        /// Задача 7
        var remainderFromDivision = (secondBoxer - firstBoxer ) % boxerWeight;
        System.out.println(" Остаток от деления " + remainderFromDivision);
        /// Задача 8 часть 1
        var totalHours = 680;
        var onePerson = 8;
        var numberOfEmployees = totalHours / onePerson;
        System.out.println(" Всего работников в компании - " + numberOfEmployees + " человек" );
        /// Задача 8 часть 2
        numberOfEmployees = numberOfEmployees + 9;
        var hoursDistribution = totalHours / numberOfEmployees;
        System.out.println(" Если в компании работает - " + numberOfEmployees + " человек, то всего " + hoursDistribution +
                " часов работы может быть поделено между сотрудниками " );

    }
}