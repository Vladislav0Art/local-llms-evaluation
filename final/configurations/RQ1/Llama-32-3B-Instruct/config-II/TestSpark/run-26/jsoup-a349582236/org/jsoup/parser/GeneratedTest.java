package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    public String tagName;
    public boolean empty;
    public boolean formatAsBlock;
    public boolean preserveWhitespace;
    public boolean formList;
    public boolean formSubmit;

    public Tag(String tagName) {
        this.tagName = tagName;
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class TagTest {

    @Test
    public void testCreateTag() {
        Tag tag = new Tag("test");
        assertNotNull(tag);
        assertEquals("test", tag.tagName);
    }

    @Test
    public void testEmptyTags() {
        Tag metaTag = new Tag("meta");
        metaTag.empty = true;
        assertTrue(metaTag.empty);

        Tag linkTag = new Tag("link");
        linkTag.empty = true;
        assertTrue(linkTag.empty);

        Tag imgTag = new Tag("img");
        imgTag.empty = true;
        assertTrue(imgTag.empty);
    }

    @Test
    public void testFormatAsInlineTags() {
        Tag aTag = new Tag("a");
        aTag.formatAsBlock = false;
        assertFalse(aTag.formatAsBlock);

        Tag pTag = new Tag("p");
        pTag.formatAsBlock = false;
        assertFalse(pTag.formatAsBlock);
    }

    @Test
    public void testPreserveWhitespaceTags() {
        Tag preTag = new Tag("pre");
        preTag.preserveWhitespace = true;
        assertTrue(preTag.preserveWhitespace);

        Tag plaintextTag = new Tag("plaintext");
        plaintextTag.preserveWhitespace = true;
        assertTrue(plaintextTag.preserveWhitespace);
    }

    @Test
    public void testFormListedTags() {
        Tag buttonTag = new Tag("button");
        buttonTag.formList = true;
        assertTrue(buttonTag.formList);

        Tag inputTag = new Tag("input");
        inputTag.formList = true;
        assertTrue(inputTag.formList);
    }

    @Test
    public void testFormSubmitTags() {
        Tag buttonTag = new Tag("button");
        buttonTag.formSubmit = true;
        assertTrue(buttonTag.formSubmit);

        Tag inputTag = new Tag("input");
        inputTag.formSubmit = true;
        assertTrue(inputTag.formSubmit);
    }

}