package org.jsoup.parser;

public class GeneratedTestNormalizeTagName {

    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public boolean isSelfClosing() {
        // Implement your logic to check self-closing tags here
        return false; // Replace with actual logic
    }
}

public class GeneratedTest {

    @Test
    public void testNormalizeTagName() {
        Tag tag = new Tag(tagName);
        String normalizedTagName = tag.getTagName().toLowerCase();
        assertEquals(tagName, normalizedTagName);
    }

}