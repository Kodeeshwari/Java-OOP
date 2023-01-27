package College;

class A {

    int i;
    public A(int i)
    {
        this.i=i;
    }

}
class B extends A{

    int j;
    public B(int j)
    {
        super(10);
        this.j=j;
    }

}
