public class Main {
    public static void main(String args[]) {
        Widget w1 = new Widget();
        Widget w2 = new Widget();
        Widget w3 = new Widget();
        System.out.println(Widget.WidgetCount);
        System.out.println(w1.WidgetCount);
    }
}

//  a non-public class
// if a class is not public, it can be on used
// by classes in the same package (i.e library)
// AND it does not have to be in its own file
class Widget {
    private String name;
    public static int WidgetCount;
    // a constructor is a method that has the
    // same name as the class
    // and whenever the class is used to create
    // a new object, the constructor method
    // is called
    public Widget() {
        WidgetCount = WidgetCount + 1;
    }
    public void foobar() {
        System.out.println("Foobar " + WidgetCount);

    }
    
}