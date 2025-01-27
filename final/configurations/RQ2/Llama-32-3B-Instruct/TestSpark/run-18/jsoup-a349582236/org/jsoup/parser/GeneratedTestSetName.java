package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestSetName {

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
    public void testSetName() {
        Tag tag = new Tag();
        tag.setName("newTest");
        System.out.println(tag.getName());
    }
}

public class Main {
    public static Object clone(Object obj) throws CloneNotSupportedException {
        return obj.getClass().getMethod("clone").invoke(obj);
    }

    public static void main(String[] args) {
        TestTagMethods test = new TestTagMethods();
        test.testCloneableTagConstructor();
        test.testSetName();
    }

}