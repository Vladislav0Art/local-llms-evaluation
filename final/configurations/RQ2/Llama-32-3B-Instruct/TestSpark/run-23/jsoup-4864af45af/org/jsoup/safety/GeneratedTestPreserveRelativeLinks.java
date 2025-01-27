package org.jsoup.safety;

public class GeneratedTestPreserveRelativeLinks {

    private String[] tags;
    private String[] attributes;

    public void addTags(String[] tags) {
        this.tags = tags;
    }

    public void addAttributes(String[] attributes) {
        this.attributes = attributes;
    }

    public boolean isSafeAttribute(String attribute) {
        return Arrays.asList(attributes).contains(attribute);
    }

    public boolean preserveRelativeLinks(boolean preserveRelativeLinks) {
        // Implementation of preserving relative links
        return true;
    }

    public String[] getTags() {
        return tags;
    }
}

public class SafelistTest {

    @Test
    public void testPreserveRelativeLinks() {
        // Arrange
        Safelist safelist = new Safelist();
        boolean preserveRelativeLinks = true;

        // Act & Assert
        assertTrue(safelist.preserveRelativeLinks(preserveRelativeLinks));
    }

}