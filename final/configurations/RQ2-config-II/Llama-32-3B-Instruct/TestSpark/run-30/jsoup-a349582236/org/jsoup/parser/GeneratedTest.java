package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings settings;

    @InjectMocks
    private Tag tag;

    @Test
    public void getName() {
        when(settings.getName()).thenReturn("tagName");
        assertEquals("tagName", tag.getName());
    }

    @Test
    public void normalName() {
        when(settings.getNormalName()).thenReturn("normalTagName");
        assertEquals("normalTagName", tag.normalName());
    }

    @Test
    public void valueOf() {
        Tag resultTag = new Tag();
        when(settings.getValueOf("tagName")).thenReturn(resultTag);
        resultTag.setName("tagName");
        Tag actualResultTag = Tag.valueOf("tagName", settings);
        assertEquals(resultTag, actualResultTag);
    }

    @Test
    public void valueOfUnknown() {
        boolean unknown = false;
        when(settings.isKnownTag()).thenReturn(unknown);
        assertFalse(Tag.valueOf("unknownTagName", settings).isKnownTag());
    }

    @Test
    public void isBlock() {
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInline() {
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isEmpty() {
        Tag emptyTag = new Tag();
        when(settings.getEmptyName()).thenReturn("");
        Tag actualResultTag = Tag.valueOf("", settings);
        assertEquals(emptyTag, actualResultTag);
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing() {
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag() {
        when(settings.isKnownTag()).thenReturn(true);
        assertTrue(Tag.valueOf("tagName", settings).isKnownTag());
    }

    @Test
    public void setSelfClosing() {
        Tag selfClosing = new Tag();
        when(settings.getSelfClosingName()).thenReturn("selfClosing");
        Tag actualResultTag = Tag.valueOf("selfClosing", settings);
        assertEquals(selfClosing, actualResultTag);
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void preserveWhitespace() {
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListed() {
        when(settings.isFormListed()).thenReturn(true);
        assertTrue(Tag.valueOf("tagName", settings).isFormListed());
    }

    @Test
    public void isFormSubmittable() {
        when(settings.isFormSubmittable()).thenReturn(false);
        assertFalse(Tag.valueOf("tagName", settings).isFormSubmittable());
    }

    @Test
    public void equals() {
        Tag otherTag = new Tag();
        when(tag.getName()).thenReturn(otherTag.getName());
        assertEquals(true, tag.equals(otherTag));
    }

}