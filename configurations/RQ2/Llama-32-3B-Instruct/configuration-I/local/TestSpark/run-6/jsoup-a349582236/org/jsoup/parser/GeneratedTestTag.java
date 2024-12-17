package org.jsoup.parser;

public class GeneratedTestTag {

    private boolean selfClosing;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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
        return selfClosing == tag1.selfClosing && this.name.equals(tag1.name);
    }

    @Override
    public int hashCode() {
        int result = selfClosing ? 42 : 0;
        result = 31 * result + this.name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Tag [selfClosing=" + selfClosing + ", name='" + name + "']";
    }
}

// TagTest.java
public class TagTest {

    @Test
    public void testTag() {
        // Create a new instance of the Tag class
        Tag tag = new Tag("Test");

        System.out.println(tag.getName());
        tag.setSelfClosing(true);
        System.out.println(tag.toString());

        // Test methods here...
    }

}