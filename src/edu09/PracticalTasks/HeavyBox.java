package edu09.PracticalTasks;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(6, "plates"));
        boxes.add(new HeavyBox(10, "knives"));
        for (var item : boxes) {
            System.out.println(item);
        }
        boxes.get(0).setWeight(1);
        System.out.println("=".repeat(40));
        for (var item : boxes) {
            System.out.println(item);
        }

        boxes.removeLast();
        System.out.println("=".repeat(40));
        for (var item : boxes) {
            System.out.println(item);
        }
        boxes.clear();
        System.out.println("=".repeat(40));

        System.out.println(boxes);

    }
}

@Setter
public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

}
