package model;

/** Klasse für ein Kunden-Objekt.
 * Created by Jean-Pierre on 26.03.2017.
 */
public class Customer implements ComparableContent<Customer>{

    private String name;
    private int sales; //Umsatz

    /**
     * Ein Kunden-Objekt besteht aus einem Namen und einem getätigten Umsatz.
     * @param name
     */
    public Customer(String name){
        this.name = name;
        this.sales = 0;
    }

    public Customer(String name, int sales){
        this.name = name;
        this.sales = sales;
    }

    /**
     *
     * @return Name des Kunden-Objekts
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return Umsatz des Kunden-Objekts
     */
    public int getSales(){
        return sales;
    }

    /**
     *
     * @param newSales Neuer Umsatz
     */
    public void setSales(int newSales){
        this.sales = newSales;
    }

    @Override
    public boolean isGreater(Customer pContent){
        return (this.name.compareTo(pContent.getName())>0);
    }

    @Override
    public boolean isEqual(Customer pContent){
        return (this.name.compareTo(pContent.getName())==0);
    }

    @Override
    public boolean isLess(Customer pContent){
        return (this.name.compareTo(pContent.getName())<0);
    }

    @Override
    public String toString(){
        return "" + name + " x " + sales;
    }
    //TODO 02: Überarbeite die Klasse so, dass sie in einem BinarySearchTree verwaltet werden kann. Kannst du auch ihre Darstellung im Baum effizient überarbeiten?
}
