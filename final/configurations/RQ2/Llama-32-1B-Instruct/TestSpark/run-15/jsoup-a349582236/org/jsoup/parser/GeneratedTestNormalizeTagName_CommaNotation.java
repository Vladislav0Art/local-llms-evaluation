package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_CommaNotation {

    @Test
    public void testNormalizeTagName_CommaNotation() {
        assertEquals("b, body", Tag.Normalizer.normalizeTagName(",b"));
        assertEquals("b; body", Tag Normalizer.normalizeTagName(";b"));
        assertEquals("b b", Tag Normalizer.normalizeTagName(","));

        assertEquals("", TagNormalizer.normalizeTagName(""));
        assertEquals("body", TagNormalizer.normalizeTagName(""));
    }

}