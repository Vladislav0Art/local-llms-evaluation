package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testgetName() {
        TestTag(tag -> assertEquals("p", tag.getName()));
        TestTag(tag -> assertEquals("div", tag.getName()));
    }

    @Test
    public void testNormalName() {
        TestTag(tag -> assertEquals("", tag.getNormalName()));
        TestTag(tag -> assertEquals("  p  ", tag.getNormalName()));
    }

    @Test
    public void testvalueOf_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            if (tag.getValue().equals(PARSING_DEFAULT)) {
                assertEquals(true, tag.valueOf());
            } else if (tag.getValue().equals(PARSING_EXACT)) {
                assertTrue(tag.valueOf());
            }
        }
    }

    @Test
    public void testvalueOfUnknown_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            if (tag.getValue().equals(PARSING_DEFAULT)) {
                assertEquals(false, tag.valueOf());
            } else if (tag.getValue().equals(PARSING_EXACT)) {
                assertTrue(tag.valueOf());
            }
        }
    }

    @Test
    public void testValueOf_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            assertEquals(Tag.valueOf(PARSING_DEFAULT), tag.getValue());
        }
    }

    @Test
    public void testValueOfUnknown_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            assertEquals(Tag.valueOf(PARSING_DEFAULT), tag.getValue());
        }
    }

    @Test
    public void testIsBlock() {
        TestTag(tag -> assertEquals(false, tag.isBlock()));
        TestTag(tag -> assertEquals(true, tag.isBlock()));
    }

    @Test
    public void testFormatAsBlock() {
        TestTag(tag -> assertEquals(false, tag.formatAsBlock()));
        TestTag(tag -> assertEquals(true, tag.formatAsBlock()));
    }

    @Test
    public void testIsInline() {
        TestTag(tag -> assertEquals(false, tag.isInline()));
        TestTag(tag -> assertEquals(true, tag.isInline()));
    }

    @Test
    public void testIsEmpty() {
        TestTag(tag -> assertEquals(false, tag.isEmpty()));
        TestTag(tag -> assertEquals(true, tag.isEmpty()));
    }

    @Test
    public void testIsSelfClosing() {
        TestTag(tag -> assertEquals(false, tag.isSelfClosing()));
        TestTag(tag -> assertEquals(true, tag.isSelfClosing()));
    }

    @Test
    public void testIsKnownTag() {
        TestTag(tag -> assertEquals(false, tag.isKnownTag()));
        TestTag(tag -> assertEquals(true, tag.isKnownTag()));
    }

    @Test
    public void testIsKnownTagUnknownTag() {
        TestTag(tag -> assertEquals(false, tag.isKnownTag("unknown")));
        TestTag(tag -> assertEquals(true, tag.isKnownTag("unknown")));
    }

}