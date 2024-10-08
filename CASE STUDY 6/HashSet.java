class A{
    int a = 5;

    void print(){
        System.out.println(a);
    }
}

class B extends A{
    int b = 10;

    void print(){
        System.out.println(b);
    }
}

class Test{
    public static void main(String[] args) {
        A aObj = new A();
        B bObj = new B();

        bObj = (B) aObj;

        bObj.print();
    }
}