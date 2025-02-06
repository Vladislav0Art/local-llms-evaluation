package org.jsoup.safety;

public class GeneratedRemoveEnforcedAttribute_RemovesEnforcedAttributeFromSafelist {

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

}