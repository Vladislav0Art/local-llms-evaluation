package org.jsoup.parser;

public class GeneratedTestClonedSpan {

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
    public void testClonedSpan() {
        // Arrange
        Parse settings = Parse.getInstance();
        String cloned = "span";

        // Act
        Tag result = settings.cloned(cloned);

        // Assert
        assertEquals("span", result);
    }
}

public class TagFactory {
    private static final Map<String, Class<?>> tagMap = new HashMap<>();

    public static void register(String name, Class<?> cls) {
        tagMap.put(name, cls);
    }

    public static <T> T createTag(String name) {
        return (T) tagMap.get(name).getConstructor(String.class).newInstance(name);
    }
}

public class ParseFactory {
    private static final Map<String, Function<Parse, Tag>> methodMap = new HashMap<>();

    public static void register(String name, Function<Parse, Tag> func) {
        methodMap.put(name, func);
    }

    public static <T> T createTag(String name) {
        return (T) methodMap.get(name).apply(Parse.getInstance());
    }
}

public class Parse {
    private static final Parse instance = new Parse();

    private Parse() {
    }

    public static Parse getInstance() {
        return instance;
    }

    public static Tag cloned(String element) {
        return new TagFactory().createTag("cloned").getConstructor(String.class).newInstance(element);
    }

    public static Tag div(Tag tag) {
        return new TagFactory().createTag("div").getConstructor(Tag.class).newInstance(tag);
    }

}