package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void none_SafeList_ReturnsNone() {
        // Arrange
        Safelist none = Safelist.none();

        // Act
        Safelist result = new Safelist(none);

        // Assert
        assertEquals(Safelist.none(), result);
    }

    @Test
    public void simpleText_SimpleText_ReturnsSimpleText() {
        // Arrange
        Safelist simpleText = Safelist.simpleText();

        // Act
        Safelist result = new Safelist(simpleText);

        // Assert
        assertEquals(Safelist.simpleText(), result);
    }

    @Test
    public void basic_Basic_ReturnsBasic() {
        // Arrange
        Safelist basic = Safelist.basic();

        // Act
        Safelist result = new Safelist(basic);

        // Assert
        assertEquals(Safelist.basic(), result);
    }

    @Test
    public void basicWithImages_BasicWithImages_ReturnsBasicWithImages() {
        // Arrange
        Safelist basicWithImages = Safelist.basicWithImages();

        // Act
        Safelist result = new Safelist(basicWithImages);

        // Assert
        assertEquals(Safelist.basicWithImages(), result);
    }

    @Test
    public void relaxed_Relaxed_ReturnsRelaxed() {
        // Arrange
        Safelist relaxed = Safelist.relaxed();

        // Act
        Safelist result = new Safelist(relaxed);

        // Assert
        assertEquals(Safelist.relaxed(), result);
    }

    @Test
    public void copy_CopyReturnsCopy() {
        // Arrange
        Safelist original = Safelist.basic();
        Safelist copy = Safelist.copy(original);

        // Act
        Safelist result = new Safelist(copy);

        // Assert
        assertEquals(Safelist.copy(original), result);
    }

    @Test
    public void addTags_AddsTagsToSafelist() {
        // Arrange
        String[] tags = {"tag1", "tag2"};
        Safelist safelist = Safelist.addTags(tags);

        // Act
        Safelist result = new Safelist(safelist);

        // Assert
        assertTrue(result.isSafeTag("tag1"));
        assertTrue(result.isSafeTag("tag2"));
    }

    @Test
    public void removeTags_RemovesTagsFromSafelist() {
        // Arrange
        String[] tags = {"tag1", "tag2"};
        Safelist safelist = Safelist.addTags(tags);
        Safelist result = Safelist.removeTags(tags);

        // Act

        // Assert
        assertFalse(result.isSafeTag("tag1"));
        assertTrue(result.isSafeTag("tag2"));
    }

    @Test
    public void addAttributes_AddsAttributesToSafelist() {
        // Arrange
        String tag = "img";
        String[] attributes = {"src", "alt"};
        Safelist safelist = Safelist.addAttributes(tag, attributes);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertEquals("src", result.getEnforcedAttributes(tag).getAttribute(0));
        assertEquals("alt", result.getEnforcedAttributes(tag).getAttribute(1));
    }

    @Test
    public void removeAttributes_RemovesAttributesFromSafelist() {
        // Arrange
        String tag = "img";
        String[] attributes = {"src", "alt"};
        Safelist safelist = Safelist.addAttributes(tag, attributes);
        Safelist result = Safelist.removeAttributes(tag, attributes);

        // Act

        // Assert
        assertTrue(result.isSafeAttribute("img", null, null));
    }

    @Test
    public void addEnforcedAttribute_AddsEnforcedAttributeToSafelist() {
        // Arrange
        String tag = "img";
        String attribute = "src";
        String value = "/path/to/image.jpg";
        Safelist safelist = Safelist.addEnforcedAttribute(tag, attribute, value);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertEquals("/path/to/image.jpg", result.getEnforcedAttributes(tag).getAttribute(attribute));
    }

    @Test
    public void removeEnforcedAttribute_RemovesEnforcedAttributeFromSafelist() {
        // Arrange
        String tag = "img";
        Safelist safelist = Safelist.addEnforcedAttribute(tag, "src", "/path/to/image.jpg");
        Safelist result = Safelist.removeEnforcedAttribute(tag, "src");

        // Act

        // Assert
        assertTrue(result.isSafeAttribute("img", null, null));
    }

    @Test
    public void preserveRelativeLinks_PreserveLinks() {
        // Arrange
        boolean preserve = true;
        Safelist safelist = Safelist.preserveRelativeLinks(preserve);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertTrue(result.preserveRelativeLinks(preserve));
    }

    @Test
    public void addProtocols_AddsProtocolsToSafelist() {
        // Arrange
        String tag = "img";
        String attribute = "src";
        String[] protocols = {"http", "https"};
        Safelist safelist = Safelist.addProtocols(tag, attribute, protocols);
        Safelist result = new Safelist(safelist);

        // Act

        // Assert
        assertEquals(protocols[0], result.getEnforcedAttributes(tag).getAttribute(attribute));
    }

    @Test
    public void removeProtocols_RemovesProtocolsFromSafelist() {
        // Arrange
        String tag = "img";
        Safelist safelist = Safelist.addProtocols(tag, "src", new String[]{"http"});
        Safelist result = Safelist.removeProtocols(tag, "src", new String[]{"https"});

        // Act

        // Assert
        assertTrue(result.isSafeAttribute("img", null, null));
    }

}