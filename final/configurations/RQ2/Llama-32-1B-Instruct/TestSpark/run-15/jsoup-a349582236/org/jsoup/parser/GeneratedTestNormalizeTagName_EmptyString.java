package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_EmptyString {

    @Test
    public void testNormalizeTagName_EmptyString() {
        assertEquals("", Tag.Normalizer.normalizeTagName(""));
        assertTrue(Tag.Normalizer.normalizeTagName("").equals(""));
    }

}