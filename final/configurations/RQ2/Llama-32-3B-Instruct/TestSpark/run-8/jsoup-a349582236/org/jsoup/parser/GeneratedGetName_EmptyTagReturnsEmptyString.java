package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetName_EmptyTagReturnsEmptyString {

    private String name;
    private boolean isBlock;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Tag tag = new Tag("tag");

    @org.junit.BeforeClass
    public static void setUpClass() {
        // Nothing to do
    }

    @Test
    public void getName_EmptyTagReturnsEmptyString() {
        assertEquals("", tag.getName());
    }

}