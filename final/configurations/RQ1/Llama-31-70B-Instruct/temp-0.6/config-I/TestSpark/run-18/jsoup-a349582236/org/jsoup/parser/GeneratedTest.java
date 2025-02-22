package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("testTagName");
    }

    @Test
    public void getName_returnsTagName_whenCalled() {
        assertEquals("testTagName", tag.getName());
    }

    @Test
    public void normalName_returnsLowerCasedTagName_whenCalled() {
        assertEquals("testtagname", tag.normalName());
    }

    @Test
    public void isBlock_returnsTrue_whenCalled() {
        assertEquals(true, tag.isBlock());
    }

    @Test
    public void formatAsBlock_returnsTrue_whenCalled() {
        assertEquals(true, tag.formatAsBlock());
    }

    @Test
    public void isEmpty_returnsFalse_whenCalled() {
        assertEquals(false, tag.isEmpty());
    }

    @Test
    public void isSelfClosing_returnsFalse_whenCalled() {
        assertEquals(false, tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_returnsFalse_whenTagNameIsUnknown() {
        assertEquals(false, Tag.isKnownTag("unknownTagName"));
    }

    @Test
    public void isKnownTag_returnsTrue_whenTagNameIsKnown() {
        assertEquals(true, Tag.isKnownTag("testTagName"));
    }

    @Test
    public void preserveWhitespace_returnsFalse_whenCalled() {
        assertEquals(false, tag.preserveWhitespace());
    }

}