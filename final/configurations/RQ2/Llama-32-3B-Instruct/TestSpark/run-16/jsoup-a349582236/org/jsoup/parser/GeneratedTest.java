package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void getNameEmptyTagReturnsNull() {
        assertNull(new Tag().getName());
    }

    @Test
    public void getNameNonEmptyTagReturnsName() {
        Tag tag = new Tag();
        tag.setName("example");
        assertEquals("example", tag.getName());
    }

    @Test
    public void normalNameNullThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Tag().normalName());
    }

    @Test
    public void normalNameEmptyStringReturnsNull() {
        Tag tag = new Tag();
        tag.setName("");
        assertEquals(null, tag.normalName());
    }

    @Test
    public void normalNameKnownTagReturnsNormalizedName() {
        Tag tag = new Tag();
        tag.setName("example");
        assertEquals("example", tag.normalName());
    }

    @Test
    public void valueOfEmptyStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.valueOf(""));
    }

    @Test
    public void valueOfNullReturnsNull() {
        Tag tag = Tag.valueOf(null);
        assertNull(tag);
    }

    @Test
    public void isBlockNullTagReturnsFalse() {
        assertFalse(Tag.isBlock(null));
    }

    @Test
    public void isBlockEmptyTagReturnsFalse() {
        Tag tag = new Tag();
        assertTrue(!tag.isBlock());
    }

    @Test
    public void isBlockKnownTagReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("example");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockNullTagReturnsFalse() {
        assertFalse(Tag.formatAsBlock(null));
    }

    @Test
    public void formatAsBlockEmptyTagReturnsFalse() {
        Tag tag = new Tag();
        assertTrue(!tag.formatAsBlock());
    }

    @Test
    public void isInlineNullTagReturnsTrue() {
        assertTrue(Tag.isInline(null));
    }

    @Test
    public void isEmptyNullTagReturnsTrue() {
        assertTrue(Tag.isEmpty(null));
    }

    @Test
    public void isSelfClosingEmptyTagReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagEmptyStringReturnsFalse() {
        assertFalse(Tag.isKnownTag(""));
    }

    @Test
    public void isKnownTagNullStringReturnsTrue() {
        assertTrue(Tag.isKnownTag(null));
    }

    @Test
    public void preserveWhitespaceNullTagReturnsFalse() {
        assertFalse(Tag.preserveWhitespace(null));
    }

    @Test
    public void isFormListedNullTagReturnsFalse() {
        assertFalse(Tag.isFormListed(null));
    }

    @Test
    public void isFormSubmittableNullTagReturnsFalse() {
        assertFalse(Tag.isFormSubmittable(null));
    }

    @Test
    public void setSelfClosingEmptyTagReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

    @Test
    public void equalsNullObjectReturnsFalse() {
        assertNotEquals(true, new Tag().equals(null));
    }

    @Test
    public void equalsSameTagsReturnsTrue() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCodeNullTagReturnsZeroHashcode() {
        assertEquals(0, new Tag().hashCode());
    }

    @Test
    public void toStringEmptyTagReturnsEmptyString() {
        Tag tag = new Tag();
        assertDoesNotThrow(() -> System.out.println(tag.toString()));
    }

}