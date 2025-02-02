package org.jsoup.parser;

public class GeneratedTestGetTag {

    private String tagName;
    private boolean isBlock;

    public Tag(String tagName) {
        this.tagName = tagName;
        this.isBlock = false;
    }

    public static void register(Tag tag) {
        tag.setTagName(tag.getTagName());
        tags.put(tag.getTagName(), tag);
    }
}

public class TagManager {

    public static Map<String, Tag> tags = new HashMap<>();

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

    @Test
    public void testGetTag() {
        // given
        Tag tag = new Tag("div");

        // when
        Optional<Tag> tagFromManager = TagManager.getTag(tag.getTagName());

        // then
        Assert.assertTrue(tagFromManager.isPresent());
    }

}