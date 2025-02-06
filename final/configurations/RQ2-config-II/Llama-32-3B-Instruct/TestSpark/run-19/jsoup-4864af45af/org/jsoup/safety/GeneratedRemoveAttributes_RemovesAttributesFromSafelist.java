package org.jsoup.safety;

public class GeneratedRemoveAttributes_RemovesAttributesFromSafelist {

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

}