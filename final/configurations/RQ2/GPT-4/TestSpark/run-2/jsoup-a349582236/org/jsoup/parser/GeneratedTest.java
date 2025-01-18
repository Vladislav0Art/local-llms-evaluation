package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isKnownTagValidTagTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void isKnownTagInvalidTagTest() {
        assertFalse(Tag.isKnownTag("invalid"));
    }

    @Test
    public void valueOfValidTagTest() {
        assertNotNull(Tag.valueOf("p"));
    }

    @Test
    public void valueOfInvalidTagTest() {
        assertNotNull(Tag.valueOf("invalid"));
    }

    @Test
    public void isBlockTest() {
        assertTrue(Tag.valueOf("p").isBlock());
    }

    @Test
    public void isInlineTest() {
        assertTrue(Tag.valueOf("span").isInline());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(Tag.valueOf("img").isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        assertTrue(Tag.valueOf("br").isSelfClosing());
    }

    @Test
    public void getValueTest() {
        assertEquals("p", Tag.valueOf("p").getName());
    }

    @Test
    public void normalNameTest() {
        assertEquals("p", Tag.valueOf("P").normalName());
    }

    @Test
    public void equalsSameObjectTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.equals(tag));
    }

    @Test
    public void equalsIdenticalObjectTest() {
        assertTrue(Tag.valueOf("p").equals(Tag.valueOf("p")));
    }

    @Test
    public void equalsDifferentObjectTest() {
        assertFalse(Tag.valueOf("p").equals(Tag.valueOf("div")));
    }

    @Test
    public void equalsDifferentTypeOfObjectTest() {
        assertFalse(Tag.valueOf("p").equals(new String("p")));
    }

    @Test
    public void hashCodeTest() {
        assertEquals(Tag.valueOf("p").hashCode(), Tag.valueOf("p").hashCode());
    }

    @Test
    public void toStringTest() {
        assertEquals("<p></p>", Tag.valueOf("p").toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag original = Tag.valueOf("p");
        Tag clone = original.clone();
        assertEquals(original, clone);
        assertNotSame(original, clone);
    }

    @Test
    public void isFormListedTest() {
        assertTrue(Tag.valueOf("input").isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        assertTrue(Tag.valueOf("p").setSelfClosing().isSelfClosing());
    }

}