package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public static String normalName(String tagName) {
        return tagName;
    }

    public boolean isBlock(String tagName) {
        return tagName.equals("block");
    }

    public boolean isInline(String tagName) {
        return tagName.equals("inline");
    }

    public boolean isSelfClosing(String tagName) {
        return tagName.equals("self-closing");
    }
}

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public static class DocumentWrapper extends Document {
        public DocumentWrapper() {
        }
    }

    public static class ElementWrapper extends Element {
        public ElementWrapper(String tagName) {
            super(tagName);
        }
    }

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        String tagName = "";
        assertEquals("", Tag.valueOf(tagName).getName());
    }

    @Test
    public void getName_NonEmptyTag_ReturnsTagName() {
        String tagName = "div";
        assertEquals("div", Tag.valueOf(tagName).getName());
    }

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmpty_NonEmptyTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void hashCodeReturnsSameHashCodesForEqualTags() {
        String tagName1 = "div";
        String tagName2 = "div";
        assertEquals(Tag.valueOf(tagName1).hashCode(), Tag.valueOf(tagName2).hashCode());
    }

}