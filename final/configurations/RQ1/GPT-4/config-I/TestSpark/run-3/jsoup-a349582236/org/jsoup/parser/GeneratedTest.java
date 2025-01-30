package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getNameTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertEquals("P", pTag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertEquals("p", pTag.normalName());
    }

    @Test
    public void valueOfKnownTagTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertEquals("P", pTag.getName());
    }

    @Test
    public void valueOfUnknownTagTest() {
        Tag unknownTag = Tag.valueOf("unknown");
        assertEquals("unknown", unknownTag.getName());
    }

    @Test
    public void isBlockKnownTagTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertTrue(pTag.isBlock());
    }

    @Test
    public void isBlockUnknownTagTest() {
        Tag unknownTag = Tag.valueOf("unknown");
        assertTrue(!unknownTag.isBlock());
    }

    @Test
    public void formatAsBlockKnownTagTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertTrue(pTag.formatAsBlock());
    }

    @Test
    public void formatAsBlockUnknownTagTest() {
        Tag unknownTag = Tag.valueOf("unknown");
        assertTrue(!unknownTag.formatAsBlock());
    }

    @Test
    public void isInlineKnownTagTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertTrue(!pTag.isInline());
    }

    @Test
    public void isInlineUnknownTagTest() {
        Tag unknownTag = Tag.valueOf("unknown");
        assertTrue(unknownTag.isInline());
    }

    @Test
    public void isEmptyKnownTagTest() {
        Tag metaTag = Tag.valueOf("meta"); // predefined tag with empty content
        assertTrue(metaTag.isEmpty());
    }

    @Test
    public void isSelfClosingKnownTagTest() {
        Tag metaTag = Tag.valueOf("meta"); // predefined tag with empty content
        assertTrue(metaTag.isSelfClosing());
    }

    @Test
    public void isKnownTagMethodTest() {
        assertTrue(Tag.isKnownTag("P"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag preTag = Tag.valueOf("pre");
        assertTrue(preTag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag buttonTag = Tag.valueOf("button");
        assertTrue(buttonTag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag inputTag = Tag.valueOf("input");
        assertTrue(inputTag.isFormSubmittable());
    }

    @Test
    public void cloneTest() {
        Tag originTag = Tag.valueOf("origin");
        Tag cloneTag = originTag.clone();
        assertNotSame(originTag, cloneTag);
        assertEquals(originTag, cloneTag);
    }

}