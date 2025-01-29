package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_DotCommaNotation {

    @Test
    public void testNormalizeTagName_DotCommaNotation() {
        assertEquals("\"b\" + \"body\"", Tag.Normalizer.normalizeMethodName("\"b\",\"body\"");
        assertEquals("\"b body\"".split("\\s+").length, TagNormalizer.normalizeMethodName("\"b;\"").split("\\s+").length);
        assertEquals("body", Tag Normalizer.normalizeMethodName("body"));

        assertEquals("", TagNormalizer.normalizeMethodName(""));
    }

}