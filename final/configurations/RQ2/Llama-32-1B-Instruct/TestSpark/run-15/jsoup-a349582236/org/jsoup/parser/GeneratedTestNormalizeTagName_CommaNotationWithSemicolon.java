package org.jsoup.parser;

public class GeneratedTestNormalizeTagName_CommaNotationWithSemicolon {

    @Test
    public void testNormalizeTagName_CommaNotationWithSemicolon() {
        assertEquals("b , body", Tag.Normalizer.normalizeMethodName(",b"));
        assertEquals("b; body", Tag Normalizer.normalizeMethodName(";b"));

        assertEquals("body", Tag Normalizer.normalizeMethodName("");
    }

}