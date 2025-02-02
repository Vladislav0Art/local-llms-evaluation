package org.jsoup.parser;

public class GeneratedTestAllTags {

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
    public void testAllTags() {
        // given
        for (String tagName : TagManager.getAllTags().stream().map(Tag::getTagName).collect(Collectors.toList())) {
            Assert.assertTrue(TagManager.getTag(tagName).isPresent());
        }

        // when
        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("div"));
        tags.add(new Tag("p"));

        // then
        Assert.assertEquals(2, tags.size());
    }

}