package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public String getAttribute(String key) {
        return "value";
    }

    public void setAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Attr getAttr() {
        return new Attr("key", "value");
    }

    public String getValue() {
        return "value";
    }
}

public class Attr {

    private String key;
    private String value;

    public Attr(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attr that = (Attr) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

public class TestService {

    private Service service;

}