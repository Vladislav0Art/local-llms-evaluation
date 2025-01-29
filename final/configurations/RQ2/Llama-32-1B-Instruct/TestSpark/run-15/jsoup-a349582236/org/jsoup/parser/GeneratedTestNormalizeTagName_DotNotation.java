package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_DotNotation {

    @Test
    public void testNormalizeTagName_DotNotation() {
        assertEquals("body", Tag.Normalizer.normalizeTagName(".b"));
        assertEquals("", Tag.Normalizer.normalizeTagName("..b"));
        assertEquals("body", TagNormalizer.normalizeTagName("\"b\""));
        assertEquals("", TagNormalizer.normalizeTagName("."));
    }

}