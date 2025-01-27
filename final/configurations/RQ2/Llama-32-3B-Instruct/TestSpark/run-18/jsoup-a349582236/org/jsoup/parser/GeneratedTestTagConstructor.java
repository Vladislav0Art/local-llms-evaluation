package org.jsoup.parser;

public class GeneratedTestTagConstructor {

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

    @Override
    public Cloneable clone() {
        return new Tag(this.name);
    }
}

public class CloneableTag extends Tag implements Cloneable {
    public CloneableTag(String name) {
        super(name);
    }
}

public class TestTagMethods {

    @Test
    public void testTagConstructor() {
        Tag tag = new Tag("test");
    }

}