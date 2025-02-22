package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void isBlock() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isBlock()).thenReturn(true);
        assertTrue(tag.isBlock());
    }

    @Test
    public void isInline() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isInline()).thenReturn(true);
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isEmpty()).thenReturn(false);
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isSelfClosing()).thenReturn(true);
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void preserveWhitespace() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.preserveWhitespace()).thenReturn(true);
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListed() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isFormListed()).thenReturn(true);
        assertTrue(tag.isFormListed());
    }

}