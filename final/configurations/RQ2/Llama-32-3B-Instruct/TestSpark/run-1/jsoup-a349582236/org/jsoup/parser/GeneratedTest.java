package org.jsoup.parser;

public class GeneratedTest {

    private static final Map<String, Class<?>> tagMap = new HashMap<>();
    private static final Map<String, Function<Parse, Tag>> methodMap = new HashMap<>();

    public static void register(String name, Function<Parse, Tag> func) {
        tagMap.put(name, func.getClass());
        methodMap.put(name, func);
    }

    public static Tag createTag(String name) {
        return methodMap.get(name).apply(null);
    }
}

public class Parse {
    private Tag tag;

    public Parse(Tag tag) {
        this.tag = tag;
    }

    public void register(String name, Function<Parse, Tag> func) {
        TagFactory.register(name, func);
    }

    public Tag getTag() {
        return tag;
    }
}

public class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ParseTest {

}