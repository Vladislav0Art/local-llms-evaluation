package org.jsoup.parser;

public class GeneratedTestClonedDiv {

    public static Tag cloned(String element) {
        return new Tag(element);
    }

    public static Tag div(Tag tag) {
        return new Tag(tag.name());
    }
}

class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(name, tag.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ParseTest {

    @Test
    public void testClonedDiv() {
        // Arrange
        Parse settings = Parse.getInstance();

        // Act
        Tag result = settings.cloned("div");

        // Assert
        assertEquals("div", result);
    }

}