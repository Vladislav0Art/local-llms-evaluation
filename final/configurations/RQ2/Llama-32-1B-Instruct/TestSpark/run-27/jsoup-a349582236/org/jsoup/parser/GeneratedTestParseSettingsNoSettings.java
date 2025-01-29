package org.jsoup.parser;

public class GeneratedTestParseSettingsNoSettings {

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
    public void testParseSettingsNoSettings() {
        // Arrange
        String tagName = "tag";
        // Act
        Tag value = TagValue.of(tagName);
        // Assert
        assertTrue(value != null && "name" == tagName);
    }
}

public class TagMockImpl implements Tag {
    private final Map<String, Object> data;

    public TagMockImpl(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String getName() {
        return (String) data.get("name");
    }

    @Override
    public String normalName() {
        return (String) data.get("normal_name");
    }

    @Override
    public static Tag valueOf(String tagName, ParseSettings settings) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", tagName);
        // Implement parse logic here
        return new TagMockImpl(data);
    }
}

}