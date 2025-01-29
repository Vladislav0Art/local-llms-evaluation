package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_SemicolonNotationWithComma {

    @Test
    public void testNormalizeTagName_SemicolonNotationWithComma() {
        assertEquals("b + body", Tag.Normalizer.normalizeMethodName(";b;"));
        assertEquals("b body +", Tag Normalizer.normalizeMethodName(";b;"));
        assertEquals("body", Tag Normalizer.normalizeMethodName(";b;b"));

        assertEquals("", TagNormalizer.normalizeMethodName(""));
    }

}