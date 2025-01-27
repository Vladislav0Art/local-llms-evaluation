package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private String name;

    public Tag() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isBlock() {
        return true; // default implementation
    }

    public String normalName() {
        Normalizer normalizer = new Normalizer();
        return normalizer.normalize(name);
    }
}

public class ParseSettings {
    private boolean selfClosing;

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }
}

public class Normalizer {
    public String normalize(String name) {
        return "";
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TagTest {

    @Mock
    private ParseSettings settings;

    public Tag tag = new Tag();

    @org.junit.BeforeClass
    public static void setUpClass() {
        // Nothing to do
    }

}