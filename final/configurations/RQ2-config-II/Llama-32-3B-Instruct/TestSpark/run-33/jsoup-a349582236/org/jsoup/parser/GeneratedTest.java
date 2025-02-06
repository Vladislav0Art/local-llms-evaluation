package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void getName_ValidTagName_ReturnsTagName() {
        String tagName = "test";
        String actualName = org.jsoup.parser.Tag.getName(tagName);
        assertEquals(tagName, actualName);
    }

    @Test
    public void getName_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.getName(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void normalName_ValidTagName_ReturnsNormalizedTagName() {
        String tagName = "test";
        String actualName = org.jsoup.parser.Tag.normalName(tagName);
        assertEquals(Normalizer.normalize(tagName), actualName);
    }

    @Test
    public void normalName_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.normalName(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void valueOf_ValidTagName_ReturnsTagObject() {
        String tagName = "test";
        Tag actualTag = org.jsoup.parser.Tag.valueOf(tagName);
        assertNotNull(actualTag);
    }

    @Test
    public void valueOf_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.valueOf(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void isBlock_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.isBlock(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void isBlock_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isBlock(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void formatAsBlock_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.formatAsBlock(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void formatAsBlock_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.formatAsBlock(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void isInline_ValidTagName_ReturnsTrue() {
        String tagName = "span";
        boolean actualResult = org.jsoup.parser.Tag.isInline(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void isInline_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isInline(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void isEmpty_ValidTagName_ReturnsTrue() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isEmpty(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void isEmpty_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isEmpty(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void isSelfClosing_ValidTagName_ReturnsTrue() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isSelfClosing(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void isSelfClosing_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isSelfClosing(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void isKnownTag_ValidTagName_ReturnsTrue() {
        String tagName = "a";
        boolean actualResult = org.jsoup.parser.Tag.isKnownTag(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void isKnownTag_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isKnownTag(invalidTagName);
        assertFalse(actualResult);
    }

    @Test
    public void isKnownTag_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.isKnownTag(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void preserveWhitespace_ValidTagName_ReturnsFalse() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.preserveWhitespace(tagName);
        assertFalse(actualResult);
    }

    @Test
    public void preserveWhitespace_InvalidTagName_ReturnsTrue() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.preserveWhitespace(invalidTagName);
        assertTrue(actualResult);
    }

    @Test
    public void isFormListed_ValidTagName_ReturnsFalse() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isFormListed(tagName);
        assertFalse(actualResult);
    }

    @Test
    public void isFormSubmittable_ValidTagName_ReturnsTrue() {
        String tagName = "input";
        boolean actualResult = org.jsoup.parser.Tag.isFormSubmittable(tagName);
        assertTrue(actualResult);
    }

    @Test
    public void setSelfClosing_ValidTagName_ReturnsTagObject() {
        Tag actualTag = new Tag();
        actualTag = org.jsoup.parser.Tag.setSelfClosing(actualTag, true);
        assertNotNull(actualTag);
    }

    @Test
    public void setSelfClosing_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.setSelfClosing(invalidTagName, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}