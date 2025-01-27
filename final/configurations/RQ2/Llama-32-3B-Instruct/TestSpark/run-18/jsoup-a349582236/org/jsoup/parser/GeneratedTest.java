package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

    private String name;
    private boolean selfClosing;

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelfClosing() {
        return false;
    }
}

public class CloneableTag extends Tag implements Cloneable {
    public void clone(CloneableTag tag) {
        this.setName(tag.getName());
    }
}

import org.junit.Test;

public class TestTagMethods {

    @Test
    public void valueOfNoSettings() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag);
    }

}