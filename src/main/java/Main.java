public class Main {
    public static void main(String[] args) {
        int i = 0;
//Предусловие
        while (i < 3) {
            System.out.println("1: " + i);
//            i = i + 1;
//            i += 1;

/*            continue;
            break;*/
            i++;
        }
//Заданное количество повторений
        // fori
        for (int j = 0; j < 3; j = j + 1) {
            System.out.println("2: " + j);
        }
// Постусловие
        int k = 0;
        do {
            System.out.println("3: " + k);
            k++;
        } while (k < 3);

// Бесконечный
/*        while(true) {
            // Тело цикла
        }    */

    }
}
