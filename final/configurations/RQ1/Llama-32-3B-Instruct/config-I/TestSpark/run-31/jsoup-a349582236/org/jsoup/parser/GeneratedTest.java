package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;
    private boolean isBlock;

    public static Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        tag.setTagName(tag.getTagName());
        tags.put(tag.getTagName(), tag);
    }

    public String getTagName() {
        return tagName;
    }
}

public class TagManager {

    public static void register(Tag tag) {
        tag.setTagName(tag.getTagName());
        tags.put(tag.getTagName(), tag);
    }

    public static List<Tag> getAllTags() {
        return new ArrayList<>(tags.values());
    }

    public static Optional<Tag> getTag(String tagName) {
        return Optional.ofNullable(tags.get(tagName));
    }
}

public class TagManagerTest {

}