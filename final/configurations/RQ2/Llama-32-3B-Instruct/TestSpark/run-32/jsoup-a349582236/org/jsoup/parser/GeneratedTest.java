package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;

    public Tag() {
    }

    public static Tag createTag(String tagName) {
        return new Tag();
    }

    public static void main(String[] args) {
        // test creation of tag
        Tag tag = Tag.createTag(tagName);
    }
}

public class GeneratedTest {

    @Test
    public void isKnownTag_tagNamesThatAreReserved_ReturnsFalse() throws Exception {
        String tagName = "script";
        assertFalse(Tag.isKnownTag(tagName));
    }

}