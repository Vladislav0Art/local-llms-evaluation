package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void testClone() {
        Tag tag = new Tag("div");
        Tag clone = tag.clone();
        assertEquals(tag.tagName, clone.tagName);
        assertEquals(tag.isBlock, clone.isBlock);
        assertEquals(tag.formatAsBlock, clone.formatAsBlock);
        assertEquals(tag.empty, clone.empty);
        assertEquals(tag.selfClosing, clone.selfClosing);
        assertEquals(tag.preserveWhitespace, clone.preserveWhitespace);
        assertEquals(tag.formList, clone.formList);
        assertEquals(tag.formSubmit, clone.formSubmit);
    }

    @Test
    public void testToString() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.toString());
    }

    @Test
    public void testEquals() {
        Tag tag1 = new Tag("div");
        Tag tag2 = new Tag("div");
        assertTrue(tag1.equals(tag2));
    }

}