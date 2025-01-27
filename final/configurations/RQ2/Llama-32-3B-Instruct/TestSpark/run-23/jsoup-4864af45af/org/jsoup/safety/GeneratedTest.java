package org.jsoup.safety;

public class GeneratedTest {

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
    public void testAddTags() {
        // Arrange
        Safelist safelist = new Safelist();
        String[] tags = {"div", "span"};
        safelist.addTags(tags);

        // Act & Assert
        assertEquals(Arrays.asList("div", "span"), safelist.getTags());
    }

    @Test
    public void testIsSafeAttribute() {
        // Arrange
        Safelist safelist = new Safelist();
        String[] attributes = {"data-test"};
        safelist.addAttributes(attributes);

        // Act & Assert
        assertTrue(safelist.isSafeAttribute("data-test"));
    }

    @Test
    public void testPreserveRelativeLinks() {
        // Arrange
        Safelist safelist = new Safelist();
        boolean preserveRelativeLinks = true;

        // Act & Assert
        assertTrue(safelist.preserveRelativeLinks(preserveRelativeLinks));
    }

}