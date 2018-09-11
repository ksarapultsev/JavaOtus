package ru.kos.home;

public class MyClass {
    int a = 10;
    boolean t = true;

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass myClass = (MyClass) o;

        if (a != myClass.a) return false;
        return t == myClass.t;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (t ? 1 : 0);
        return result;
    }
    */
public MyClass() {

}

    public MyClass(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", t=" + t +
                '}';
    }
}
