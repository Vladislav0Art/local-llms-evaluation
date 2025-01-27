package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private static final Map<String, Boolean> selfClosingTags = new HashMap<>();

    static {
        selfClosingTags.put("area", true);
        // ... other self-closing tags ...
    }

    public String getName() {
        return this.tagName();
    }

    public boolean isSelfClosing() {
        return selfClosingTags.containsKey(tagName());
    }

    @Override
    public boolean isEmpty() {
        return tagName().isEmpty();
    }
}

public class TagTest {

    @Test
    public void getName_EmptyTag_ReturnsEmpty() {
        String name = Tag.valueOf("").getName();
        assertEquals("", name);
    }

    @Test
    public void isBlock_SelfClosingTag_ReturnsFalse() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isSelfClosing());
        assertFalse(Tag.valueOf(tagName).formatAsBlock());
    }

    @Test
    public void isInline_SelfOpeningTag_ReturnsTrue() {
        String tagName = "span";
        assertTrue(Tag.valueOf(tagName).isInline());
    }

    @Test
    public void isEmpty_MultipleEmptyTags_ReturnsTrue() {
        for (int i = 0; i < 100; i++) {
            Tag tag = Tag.valueOf("");
        }
        assertTrue(Tag.valueOf("").isEmpty());
    }

    @Test
    public void isKnownTag_KnownTagName_ReturnsTrue() {
        String tagName = "script";
        assertTrue(Tag.isKnownTag(tagName));
    }

}