package org.jsoup.safety;

public class GeneratedAddEnforcedAttribute_AddsEnforcedAttributeToSafelist {

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

}