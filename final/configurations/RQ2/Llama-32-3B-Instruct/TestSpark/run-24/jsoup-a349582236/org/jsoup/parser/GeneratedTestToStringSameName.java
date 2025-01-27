package org.jsoup.parser;

public class GeneratedTestToStringSameName {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Tag))
            return false;
        Tag other = (Tag) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Tag{" + "name='" + name + '\'' + '}';
    }
}

public class TagTests {

    @Test
    public void testToStringSameName() {
        Tag tag1 = new Tag("test");
        Tag tag2 = new Tag("test");
        assertEquals(tag1.toString(), tag2.toString());
    }

}