package org.jsoup.safety;

public class GeneratedAddAttributes_AddsAttributesToSafelist {

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

}