package org.jsoup.parser;

public class GeneratedTest {

    private boolean selfClosing;
    private String name;

    public static Tag of(String tagName, ParseSettings parseSettings) {
        return new Tag(tagName);
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;
        Tag tag1 = (Tag) o;
        return this.name.equals(tag1.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Tag [selfClosing=" + this.selfClosing + ", name='" + this.name + "']";
    }
}

// TagTest.java
public class TagTest {

    private ParseSettings parseSettings;

    public TagTest(ParseSettings parseSettings) {
        this.parseSettings = parseSettings;
    }

}