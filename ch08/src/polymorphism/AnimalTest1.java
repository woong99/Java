package polymorphism;

import java.util.ArrayList;

public class AnimalTest1 {
    ArrayList<Animal> animalArrayList = new ArrayList<>();

    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        aTest.testCasting();
    }

    public void addAnimal() {
        animalArrayList.add(new Human());
        animalArrayList.add(new Tiger());
        animalArrayList.add(new Eagle());

        for (Animal ani : animalArrayList) {
            ani.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < animalArrayList.size(); i++) {
            Animal ani = animalArrayList.get(i);
            if (ani instanceof Human) {
                Human h = (Human) ani;
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형식입니다.");
            }

        }
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}
