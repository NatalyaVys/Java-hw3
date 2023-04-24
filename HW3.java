
import java.util.*;

public class HW3 {
    public static void main(String[] args) {

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа       
        Random d = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = d.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("1.Cортировки списков компаратором.\n Первоначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s\n", list1);
        print_divider();

//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.printf("2. удалить из списка чётные числа.\n");
        ArrayList<Integer> list_2 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);

        System.out.println(list_2);

        for (int In = 0; i < list_2.size(); i++) { 
            if (list_2.get(i) % 2 == 0) {
                list_2.remove(i);                  
            }
        }

        System.out.println(list_2);
        print_divider();

//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        System.out.printf("3. список ArrayList. Найти мин, макс и среднее из этого списка.\n");
        ArrayList<Integer> list_3 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);

        System.out.println(list_3);

        Integer max = Collections.max(list_3);
        Integer min = Collections.min(list_3);
        Integer avg = calculateAverage(list_3);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
        print_divider();

//4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        System.out.printf("4. объеденить два целочисленных списка не допуская повторения с первым.\n");
        ArrayList<Integer> list_4_0 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);
        ArrayList<Integer> list_4_1 = formArrayWithRandomTen(new ArrayList<Integer>(), 10, 25);
        System.out.println("list_4_0: " + list_4_0);
        System.out.println("list_4_1: " + list_4_1);
        
        list_4_1.removeAll(list_4_0);
        list_4_0.addAll(list_4_1);
        System.out.println("общий: " + list_4_0);
        print_divider();


//5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        System.out.printf("5. Создать ArrayList<Integer>\n");
        ArrayList<Integer> arrayList = new ArrayList<>();

        long beginArrayList = System.nanoTime();
        for (int In = 0; i < 10000; i++) {
            arrayList.add(0);
        }
        long endArrayList = System.nanoTime();
        long resultArrayList = endArrayList - beginArrayList;
        System.out.println("ArrayList с 10 000 нулями");
        print_divider();

// 6. Повторить пятый пункт но с LinkedList.
        System.out.printf("6. Повторить 5.пункт, но с LinkedList.\n");

        LinkedList<Integer> linkedList = new LinkedList<>();

        long beginLinkedList = System.nanoTime();
        for (int In = 0; i < 10000; i++) {
            arrayList.add(0);
        }
        long endLinkedList = System.nanoTime();
        long resultLinkedList =  endLinkedList - beginLinkedList;
        System.out.println("Создан LinkedList с 10 000 нулями");
        print_divider();

//7. Сравнить время работы пятого и шестого пунктов.
        System.out.printf("7. Сравнить время работы ArrayList и LinkedList.\n");
        System.out.println("ArrayList: " + resultArrayList);
        System.out.println("LinkedList: " + resultLinkedList);
       
    }

    private static void print_divider() {
        System.out.println("=".repeat(30));
    }

    private static int calculateAverage(List <Integer> inArray) {
        int sum = 0;
        for (int i=0; i< inArray.size(); i++) {
            sum += i;
        }
        return sum / inArray.size();
    }

    private static ArrayList<Integer> formArrayWithRandomTen(ArrayList<Integer> inArray, int length, int bound){
        for (int i = 0; i < length; i++) {
            inArray.add(new Random().nextInt(bound));
        }
        return inArray;
    }
}
