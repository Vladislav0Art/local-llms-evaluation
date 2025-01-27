package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTest {

    @Test
    public void testGetName_EmptyStringReturnsEmptyString() {
        assertTrue(Tag.getName("").isEmpty());
    }

    @Test
    public void testGetName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.getName(null));
    }

    @Test
    public void testNormalName_EmptyStringReturnsEmptyString() {
        assertEquals("", Tag.normalName(""));
    }

    @Test
    public void testNormalName_NullStringThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Tag.normalName(null));
    }

    @Test
    public void testValueOf_EmptyStringReturnsNullTag() {
        assertNull(Tag.valueOf(""));
    }

    @Test
    public void testValueOf_NullStringReturnsNullTag() {
        assertNull(Tag.valueOf(null));
    }

    @Test
    public void testIsBlock_TagWithBlockAttributeReturnsTrue() {
        assertTrue(Tag.isBlock("div"));
    }

    @Test
    public void testIsBlock_TagWithoutBlockAttributeReturnsFalse() {
        assertFalse(Tag.isBlock("p"));
    }

    @Test
    public void testFormatAsBlock_TagWithBlockAttributeReturnsTrue() {
        assertTrue(Tag.formatAsBlock("div"));
    }

    @Test
    public void testFormatAsBlock_TagWithoutBlockAttributeReturnsFalse() {
        assertFalse(Tag.formatAsBlock("p"));
    }

    @Test
    public void testIsInline_TagWithInlineAttributeReturnsTrue() {
        assertTrue(Tag.isInline("span"));
    }

    @Test
    public void testIsInline_TagWithoutInlineAttributeReturnsFalse() {
        assertFalse(Tag.isInline("div"));
    }

    @Test
    public void testIsEmpty_EmptyTagReturnsTrue() {
        assertTrue(Tag.isEmpty(""));
    }

    @Test
    public void testIsEmpty_TagWithNoAttributesOrChildNodesReturnsTrue() {
        assertTrue(Tag.isEmpty("<tag>"));
    }

    @Test
    public void testIsEmpty_TagWithAttributesButNoChildNodesReturnsFalse() {
        assertFalse(Tag.isEmpty("<tag attr>"));
    }

    @Test
    public void testIsSelfClosing_TagWithSelfClosingAttributeReturnsTrue() {
        assertTrue(Tag.isSelfClosing("img"));
    }

    @Test
    public void testIsSelfClosing_TAGWithoutSelfClosingAttributeReturnsFalse() {
        assertFalse(Tag.isSelfClosing("p"));
    }

    @Test
    public void testIsFormListed_TagWithNameAttrFormAttributesReturnsTrue() {
        assertTrue(Tag.isFormListed("<form><tag>"));
    }

    @Test
    public void testIsFormSubmittable_EmptyTagDoesNotReturnTrue() {
        assertFalse(Tag.isFormSubmittable(""));
    }

    @Test
    public void testIsFormSubmittable

    TAGWithoutFormAttributesReturnsFalse() {
        assertFalse(Tag.isFormSubmitted("", "<form>"));
    }

    @Test
    public void testSetSelfClosing_TagWithSetSelfClosingMethodReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

}