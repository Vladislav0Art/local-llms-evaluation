package org.jsoup.parser;

public class GeneratedTestParseSettings {

    private final String name;

    public TagImpl(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagImpl tagImpl = (TagImpl) o;
        return Objects.equals(name, tagImpl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "TagImpl[name=" + name + "]";
    }
}

public class TagValueTest {
    private static final TagImpl TAG = new TagImpl("tag");

    @Test
    public void testParseSettings() {
        // Arrange
        String tagName = "tag";
        ParseSettings settings = new ParseSettings();
        // Act
        Tag value = TagValue.of(tagName, settings).parse();
        // Assert
        assertTrue(value != null && "name" == "tagName");
    }

}