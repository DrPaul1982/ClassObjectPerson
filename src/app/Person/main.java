package app.Person;



    public class main {

        String name;
        int age;
        String profession;

        public main(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void personInfoOut() {
            System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
        }

        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }


        public static void main(String[] args) {
            main main1 = new main("John", 30, "Інженер");
            main main2 = new main("Mary", 25, "Вчитель");
            main main3 = new main("Bob", 35, "Лікар");
            main main4 = new main("Alice", 28, "Архітектор");

            System.out.print("1. ");
            main1.personInfoOut();
            main2.personInfoOut();
            main3.personInfoOut();


            System.out.print("\n2. ");
            main4.personInfoOut();
            main4.setProfession("Дизайнер");

            System.out.println("(Після оновлення професії)");
            main4.personInfoOut();
        }
    }

