package org.jsoup.parser;

public class GeneratedNormalName_ValidTagName_ReturnsNormalizedTagName {

    @Test
    public void normalName_ValidTagName_ReturnsNormalizedTagName() {
        String tagName = "test";
        String actualName = org.jsoup.parser.Tag.normalName(tagName);
        assertEquals(Normalizer.normalize(tagName), actualName);
    }

}