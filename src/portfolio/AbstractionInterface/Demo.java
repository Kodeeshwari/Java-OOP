package portfolio.AbstractionInterface;


class Demo {

    public static void main(String args[]) {
        Book myBook = new MyBook("Harry Potter", "J.k. Rowling", "100");
        System.out.println(myBook.getDetails());
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 20));
    }

}
