package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Document {
    private String data;

    public Document(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class IOException extends Exception {

}

public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

import org.jsoup.nodes.Appendable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    @BeforeEach
    public void setupJsoupConfig() {
        java.util.Map<String, String> jsoupConfig = new java.util.HashMap<>();
        jsoupConfig.put("jsoup-2f48a617fe", "");
        org.jsoup.Jsoup.init(jsoupConfig);
    }

    public Appendable createAppendable() {
        return new org.jsoup.nodes.Appendable();
    }

}