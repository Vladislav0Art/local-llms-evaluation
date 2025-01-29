package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testGetValue() {
        expectedValue.put("name", false);
        expectedValue.put("isBlock", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isBlock"), value.isBlock());
    }

    @Test
    public void testGetValueBlock() {
        expectedValue.put("name", false);
        expectedValue.put("formatAsBlock", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("formatAsBlock"), value.formatAsBlock());
    }

    @Test
    public void testGetValueInline() {
        expectedValue.put("name", false);
        expectedValue.put("isInline", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isInline"), value.isInline());
    }

    @Test
    public void testGetValueEmpty() {
        expectedValue.put("name", false);
        expectedValue.put("isEmpty", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isEmpty"), value.isEmpty());
    }

    @Test
    public void testGetValueIsSelfClosing() {
        expectedValue.put("name", false);
        expectedValue.put("isSelfClosing", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isSelfClosing"), value.isSelfClosing());
    }

    @Test
    public void testGetValueIsKnownTag() {
        expectedValue.put("name", false);
        expectedValue.put("isKnownTag", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isKnownTag"), value.isKnownTag());
    }

    @Test
    public void testGetValueIsKnownTagBlock() {
        expectedValue.put("name", false);
        expectedValue.put("isKnownTag", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isKnownTag"), value.isKnownTag());
    }

    @Test
    public void testGetValueIsBlock() {
        expectedValue.put("name", false);
        expectedValue.put("isBlock", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isBlock"), value.isBlock());
    }

    @Test
    public void testGetValueIsFormListed() {
        expectedValue.put("name", false);
        expectedValue.put("isFormListed", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isFormListed"), value.isFormListed());
    }

    @Test
    public void testGetValueIsFormSubmittable() {
        expectedValue.put("name", false);
        expectedValue.put("isFormSubmittable", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isFormSubmittable"), value.isFormSubmittable());
    }

    @Test
    public void testGetValueSetSelfClosing() {
        expectedValue.put("name", false);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        value.setSelfClosing(true);
        Mockito.verify(value).setSelfClosing();
    }

    @Test
    public void testEquals() {
        String tag1 = "div";
        String tag2 = "p";
        Tag tag3 = new Tag(tag1, Parser.parseSettings());
        Tag tag4 = new Tag(tag2, Parser.parseSettings());

        assertEquals(tag1, tag3.toString());
        Mockito.verify(tag3).equals(tag4);
    }

    @Test
    public void testHashCode() {
        String tag1 = "div";
        String tag2 = "p";

        int hashValue1 = Tag.valueOf(tag1, Parser.parseSettings()).hashCode();
        int hashValue2 = Tag.valueOf(tag2, Parser.parseSettings()).hashCode();

        assertEquals(hashValue1, hashValue2);
    }

    @Test
    public void testToString() {
        String tag1 = "div";
        String tag2 = "p";

        assertEquals("div", tag1.toString());
        assertEquals("p", tag2.toString());
    }

}