package review8;

public class Store {
    public static void main(String[] args) {

        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort();//runtime polymorphism

        Furniture table=new Table();
        table.comfort();//runtime polymorphism
        table.assemble();

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable();
        t.buildTable("wood");

        //right way accessing static method
        Chair.breaks();
        Furniture.breaks();

        Furniture chair1=new Chair();
        chair1.assemble();
        chair1.comfort();
        //proof that method breaks is not overriden
        chair1.breaks();//since we are not overriding methods breaks will be executed from parent
        //this id also not the right way to call static method
    }
}
