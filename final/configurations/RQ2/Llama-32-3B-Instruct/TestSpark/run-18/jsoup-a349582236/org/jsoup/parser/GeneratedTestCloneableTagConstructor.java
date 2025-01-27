package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCloneableTagConstructor {

    private String name;
    private boolean selfClosing;

    public Tag(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelfClosing() {
        return false;
    }
}

public class CloneableTag extends Tag implements Cloneable {
    public CloneableTag(String name) {
        super(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneableTag(this.name);
    }
}

import org.junit.Test;

public class TestTagMethods {

    @Test
    public void testCloneableTagConstructor() {
        CloneableTag tag = (CloneableTag) clone(new CloneableTag("test"));
    }

}