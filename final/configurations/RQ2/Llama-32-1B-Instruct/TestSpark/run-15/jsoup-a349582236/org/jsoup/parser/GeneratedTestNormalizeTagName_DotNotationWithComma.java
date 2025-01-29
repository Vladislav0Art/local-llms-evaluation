package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_DotNotationWithComma {

    @Test
    public void testNormalizeTagName_DotNotationWithComma() {
        assertEquals("b," + "body", Tag.Normalizer.normalizeTagName(".b;"));
        assertEquals("b body", TagNormalizer.normalizeMethodName(".b;b"));
        assertEquals("", TagNormalizer.normalizeMethodName(";b"));

        assertEquals("b", Tag Normalizer.normalizeMethodName(""));
    }

}