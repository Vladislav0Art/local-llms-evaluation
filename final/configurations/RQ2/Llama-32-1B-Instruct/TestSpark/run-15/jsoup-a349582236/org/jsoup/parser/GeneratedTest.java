package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void testNormalizeTagName_BeforeNormalization() {
        assertEquals("body", Tag.Normalizer.normalizeTagName("b"));
    }

    @Test
    public void testNormalizeTagName_EmptyString() {
        assertEquals("", Tag.Normalizer.normalizeTagName(""));
        assertTrue(Tag.Normalizer.normalizeTagName("").equals(""));
    }

    @Test
    public void testNormalizeTagName_DotNotation() {
        assertEquals("body", Tag.Normalizer.normalizeTagName(".b"));
        assertEquals("", Tag.Normalizer.normalizeTagName("..b"));
        assertEquals("body", TagNormalizer.normalizeTagName("\"b\""));
        assertEquals("", TagNormalizer.normalizeTagName("."));
    }

    @Test
    public void testNormalizeTagName_DotCommaNotation() {
        assertEquals("b", Tag.Normalizer.normalizeTagName("b,"));
        assertEquals("b", Tag.Normalizer.normalizeTagName(",b"));
        assertEquals("body", Tag Normalizer.normalizeTagName("body,"));
        assertEquals("", TagNormalizer.normalizeTagName(","));
    }

    @Test
    public void testNormalizeTagName_SemicolonNotation() {
        assertEquals("b; body", Tag.Normalizer.normalizeTagName("b;b"));
        assertEquals("b body", TagNormalizer.normalizeTagName(";b"));
        assertEquals("body", Tag Normalizer.normalizeTagName(";b"));
        assertEquals("", TagNormalizer.normalizeTagName(";"));
    }

    @Test
    public void testNormalizeTagName_CommaNotation() {
        assertEquals("b, body", Tag.Normalizer.normalizeTagName(",b"));
        assertEquals("b; body", Tag Normalizer.normalizeTagName(";b"));
        assertEquals("b b", Tag Normalizer.normalizeTagName(","));

        assertEquals("", TagNormalizer.normalizeTagName(""));
        assertEquals("body", TagNormalizer.normalizeTagName(""));
    }

    @Test
    public void testNormalizeTagName_DotNotationWithComma() {
        assertEquals("b," + "body", Tag.Normalizer.normalizeTagName(".b;"));
        assertEquals("b body", TagNormalizer.normalizeMethodName(".b;b"));
        assertEquals("", TagNormalizer.normalizeMethodName(";b"));

        assertEquals("b", Tag Normalizer.normalizeMethodName(""));
    }

    @Test
    public void testNormalizeTagName_DotCommaNotation() {
        assertEquals("\"b\" + \"body\"", Tag.Normalizer.normalizeMethodName("\"b\",\"body\"");
        assertEquals("\"b body\"".split("\\s+").length, TagNormalizer.normalizeMethodName("\"b;\"").split("\\s+").length);
        assertEquals("body", Tag Normalizer.normalizeMethodName("body"));

        assertEquals("", TagNormalizer.normalizeMethodName(""));
    }

    @Test
    public void testNormalizeTagName_SemicolonNotationWithComma() {
        assertEquals("b + body", Tag.Normalizer.normalizeMethodName(";b;"));
        assertEquals("b body +", Tag Normalizer.normalizeMethodName(";b;"));
        assertEquals("body", Tag Normalizer.normalizeMethodName(";b;b"));

        assertEquals("", TagNormalizer.normalizeMethodName(""));
    }

    @Test
    public void testNormalizeTagName_CommaNotationWithSemicolon() {
        assertEquals("b , body", Tag.Normalizer.normalizeMethodName(",b"));
        assertEquals("b; body", Tag Normalizer.normalizeMethodName(";b"));

        assertEquals("body", Tag Normalizer.normalizeMethodName("");
    }

}