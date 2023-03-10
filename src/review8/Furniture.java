package review8;

public class Furniture {

    public static void breaks() {
    }

    public void assemble() {
        System.out.println("Furniture need to be assembled");
    }

    public void comfort() {//overriden
        System.out.println("Furniture needs to be comfortable");
    }
}

class Chair extends Furniture {

    private void use(){
        System.out.println("Chair use by humans to sit");
    }
    public static void breaks(){
        System.out.println("Chair can break too");
    }
    public void comfort() {//overriding
        System.out.println("Not every chair is comfortable");
    }

    protected void loveSeat() {
        System.out.println("This is the best chair");
    }}

class Table extends Furniture {
        public void comfort() {
            System.out.println("Table cannot be comfortable");
        }

        protected void buildTable() {
            System.out.println("We can easily build a table");
        }
        void buildTable(String material){
            System.out.println("We build table using "+material);
        }
    }
