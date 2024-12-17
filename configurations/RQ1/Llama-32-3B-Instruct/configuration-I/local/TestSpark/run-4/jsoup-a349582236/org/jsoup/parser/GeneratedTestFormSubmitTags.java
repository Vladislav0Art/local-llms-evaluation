package org.jsoup.parser;

public class GeneratedTestFormSubmitTags {

    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}

public class TagTests {

    public static final List<String> blockTags = Arrays.asList("b", "strong");
    public static final List<String> inlineTags = Arrays.asList("i", "em");
    public static final List<String> emptyTags = Collections.singletonList("br");

    public static void main(String[] args) {
        Tag tags = new Tag("");
        System.out.println(tags);
    }

    @Test
    public void testFormSubmitTags() {
        System.out.println(Tag.formSubmitTags.get(0));
    }

}