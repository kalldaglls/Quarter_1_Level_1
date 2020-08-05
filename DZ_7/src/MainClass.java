public class MainClass {
    public static void main(String[] args) {
        Cat [] cat = new Cat[5];
        cat [0] = new Cat("Thomas", 24, false);
        cat [1] = new Cat("Matroskin", 11, false);
        cat [2] = new Cat("Puss", 19, false);
        cat [3] = new Cat("Gav", 45, false);
        cat [4] = new Cat("Bazilevs", 24, false);
        Plate plate = new Plate(100);
        catInfo(cat, plate);
        /*plate.info();
        cat.eat(plate);
        plate.info();
        cat1.eat(plate);
        plate.info();
         */
    }
    public static void catInfo (Cat [] cat, Plate plate) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.info();
            }
        }
    }

  /*    Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
        Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

   */

