package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_SemicolonNotation {

    @Test
    public void testNormalizeTagName_SemicolonNotation() {
        assertEquals("b; body", Tag.Normalizer.normalizeTagName("b;b"));
        assertEquals("b body", TagNormalizer.normalizeTagName(";b"));
        assertEquals("body", Tag Normalizer.normalizeTagName(";b"));
        assertEquals("", TagNormalizer.normalizeTagName(";"));
    }

}