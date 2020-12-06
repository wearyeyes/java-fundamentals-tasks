// 1. Приветствовать любого пользователя при вводе его имени через командную строку.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String userName = in.nextLine();
    System.out.printf("Hello, %s!", userName);
}

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
public static void main(String[] args) {
    for (int i = args.length-1; i >= 0; i--) {
        System.out.print(args[i] + " ");
    }
}

// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfRepetitions = scanner.nextInt();

    Random random = new Random();
    for (int i = 0; i < numberOfRepetitions; i++) {
        System.out.println(random.nextInt());
    }
}

// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.
public static void main(String[] args) {
    int sum = 0;
    for (String argument : args) {
        sum += Integer.parseInt(argument);
    }
    System.out.println(sum);
}

// 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего
// данному числу. Осуществить проверку корректности ввода чисел.
public static void main(String[] args) {
    System.out.println("Enter number of month: ");
    Scanner scanner = new Scanner(System.in);
    Byte numberOfMonth = scanner.nextByte();

    switch (numberOfMonth) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May")
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid number");
    }
}