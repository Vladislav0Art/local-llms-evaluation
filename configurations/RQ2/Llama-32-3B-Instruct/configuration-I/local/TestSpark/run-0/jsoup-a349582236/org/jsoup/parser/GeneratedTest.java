package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_EmptyReturnsNull() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(false);
        assertNull(tag.getName());
    }

    @Test
    public void testNormalName_EmptyReturnsNull() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertNull(tag.normalName());
    }

    @Test
    public void testGetValueOf_KnownTagReturnsKnownTag() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        Tag result = Tag.valueOf("p", parseSettings);
        assertTrue(result.isKnownTag());
    }

    @Test
    public void testGetValueOf_UnknownTagReturnsNull() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        Tag result = Tag.valueOf("unknown", parseSettings);
        assertNull(result);
    }

    @Test
    public void testIsBlock_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock_EmptyReturnsTrue() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testIsInline_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isInline());
    }

    @Test
    public void testIsEmpty_EmptyReturnsTrue() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertTrue(tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testPreserveWhitespace_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void testIsFormListed_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isFormListed());
    }

    @Test
    public void testIsFormSubmittable_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testSetSelfClosing_ReturnsTag() {
        Tag result = tag.setSelfClosing();
        assertTrue(result.selfClosing());
    }

    @Test
    public void testEquals_EmptyReturnsFalse() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertFalse(tag.equals(null));
    }

    @Test
    public void testHashCode_EmptyReturnsZero() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertEquals(0, tag.hashCode());
    }
}

public class Tag {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSelfClosing() {
        // implementation
        return false;
    }

    public boolean formatAsBlock() {
        // implementation
        return false;
    }

    public String normalName() {
        // implementation
        return "";
    }

}