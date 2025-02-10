package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest1 {

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
    public void test1() throws IOException {
        Document doc = Jsoup.connect("http://example.com").get();
        Element html = doc.selectFirst("html");
        System.out.println(html);
    }

}