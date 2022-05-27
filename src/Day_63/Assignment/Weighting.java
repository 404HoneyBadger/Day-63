package Day_63.Assignment;

import java.util.ArrayList;

public class Weighting {
    public class Suitcase {

        private int maximumWeight;
        private ArrayList<Item> Items;

        public Suitcase(int maximumWeight) {
            this.Items = new ArrayList<>();
            this.maximumWeight = maximumWeight;
        }

        public void addItem(Item Item) {
            if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
                return;
            }

            this.Items.add(Item);
        }

        public int totalWeight() {
            int summa = Items.stream().mapToInt(Item::getWeight).sum();
            return summa;
        }

        public void printItems() {
            int indeksi = 0;
            while (indeksi < this.Items.size()) {
                Item t = this.Items.get(indeksi);
                System.out.println(t);
                indeksi++;
            }
        }

        public Item heaviestItem() {
            if (this.Items.isEmpty()) {
                return null;
            }

            // Tutustumme järjestämiseen hieman myöhemmin kurssilla
            return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
        }

        @Override
        public String toString() {
            if (this.Items.isEmpty()) {
                return "no items (0 kg)";
            }

            if (this.Items.size() == 1) {
                return "1 item (" + this.totalWeight() + " kg)";
            }

            return this.Items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

    public class Item {

        private String name;
        private int weight;

        public Item(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public int getWeight() {
            return this.weight;
        }

        @Override
        public String toString() {
            return this.name + ": (" + this.weight + " kg)";
        }
    }
    public class Hold {

        private ArrayList<Suitcase> suitcases;
        private int maximumWeight;

        public Hold(int maximumWeight) {
            this.maximumWeight = maximumWeight;
            this.suitcases = new ArrayList<>();
        }

        public void addSuitcase(Suitcase Suitcase) {
            if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
                return;
            }

            this.suitcases.add(Suitcase);
        }

        public int totalWeight() {
            int summa = suitcases.stream().mapToInt(Suitcase::totalWeight).sum();

            return summa;
        }

        public void printItems() {
            suitcases.stream().forEach(suitcase -> suitcase.printItems());
        }

        @Override
        public String toString() {
            if (this.suitcases.isEmpty()) {
                return "no suitcases (0 kg)";
            }

            if (this.suitcases.size() == 1) {
                return "1 suitcase (" + this.totalWeight() + " kg)";
            }

            return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
        }
    }

    public static void main(String[] args) {

    }
}
