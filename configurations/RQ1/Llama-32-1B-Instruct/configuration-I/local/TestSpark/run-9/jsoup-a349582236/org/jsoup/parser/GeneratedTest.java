package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testBlockTag() {
        // Test block tag
        Tag tag = new Tag("pre");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "pre");
        assertSame(tag.isBlock(), true);

        tag = new Tag("code");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "code");
        assertSame(tag.isBlock(), false);

        tag = new Tag("table");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "table");
        assertSame(tag.isBlock(), true);
    }

    @Test
    public void testInlineTag() {
        // Test inline tag
        Tag tag = new Tag("p");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "p");
        assertSame(tag.isBlock(), false);

        tag = new Tag("span");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "span");
        assertSame(tag.isBlock(), true);

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

    @Test
    public void testEmptyTag() {
        // Test empty tag
        Tag tag = tags.get("meta");
        Validate.notNull(tag);

        tag.empty = true;
        tag.formatAsBlock = true;
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "base");

        tag = new Tag("title");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "title");
        assertSame(tag.isBlock(), false);

        tag = tags.get("link");
        validate.notNull(tag);
        tag.formatAsBlock = true;
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "h1");

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

    @Test
    public void testFormatAsInlineTags() {
        // Test format as inline tags
        Tag tag = new Tag("script");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "script");
        assertSame(tag.formatAsBlock(), true);

        tag = new Tag("style");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "style");
        assertSame(tag.formatAsBlock(), false);

        tag = tags.get("title");
        validate.notNull(tag);
        assertSame(tag.getTagName(), "title");
        assertSame(tag.formatAsBlock(), true);
    }

    @Test
    public void testPreserveWhitespaceTags() {
        // Test preserve whitespace tags
        Tag tag = new Tag("div");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "div");
        assertSame(tag.isBlock(), true);

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

    @Test
    public void testFormListedTags() {
        // Test form listed tags
        Tag tag = new Tag("button");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "button");
        assertSame(tag.isBlock(), true);

        tag = new Tag("fieldset");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "fieldset");
        assertSame(tag.isBlock(), false);

        tag = new Tag("input");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "input");
        assertSame(tag.isBlock(), true);

        // Check form listed tags
        tag = new Tag("form");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "form");
        assertSame(tag.isBlock(), false);

        tag = new Tag("select");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "select");
        assertSame(tag.isBlock(), true);
    }

    @Test
    public void testFormSubmitTags() {
        // Test form submit tags
        Tag tag = new Tag("input");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "input");
        assertSame(tag.isBlock(), false);

        tag = new Tag("keygen");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "keygen");
        assertSame(tag.isBlock(), true);

        tag = new Tag("button");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "button");
        assertSame(tag.isBlock(), false);
    }

}