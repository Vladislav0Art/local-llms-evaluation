package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest3 {

    private double value;

    public MyObject(double value) {
        this.value = value;
    }

    public void normalize() {
        // implementation
    }

    public String getMyProperty() {
        return "value";
    }
}

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void normalize() {
        // implementation
    }
}

public class MyOtherClass {
    private double value;

    public MyOtherClass(double value) {
        this.value = value;
    }

    public void normalize() {
        // implementation
    }
}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void test3() throws IOException {
        MyObject obj1 = new MyObject(10.0);
        obj1.normalize();
        System.out.println(obj1.getMyProperty());
    }

}