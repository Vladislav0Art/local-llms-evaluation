package org.jsoup.safety;

public class GeneratedIsSafeAttribute_IsSafeAttributeReturnsTrueForImagesWithAlt {

    @Test
    public void isSafeAttribute_IsSafeAttributeReturnsTrueForImagesWithAlt() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addAttributes("img", "alt", "example-alt");
        assertTrue(safelist.isSafeAttribute(null, null, new Attribute("alt", "example-alt")));
    }

}