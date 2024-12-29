package org.jsoup.parser;

public class GeneratedTestToString {

    private String name;
    private int hashCode;

    public Tag(String name) {
        this.name = name;
        this.hashCode = name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tag tag = (Tag) obj;
        return hashCode == tag.hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isEquals(Tag other) {
        return this.name.equals(other.name);
    }

    public int getHashCode() {
        return hashCode;
    }
}

public class GeneratedTest {
    private Tag tag;

    public GeneratedTest(String tagName) {
        this.tag = new Tag(tagName);
    }

    @Test
    public void testToString() {
        GeneratedTest test = new GeneratedTest("tag");

        assertEquals("tag", test.toString());
    }

}