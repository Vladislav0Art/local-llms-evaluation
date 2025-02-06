package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings settings;

    public Tag valueOf(String tagName) {
        return new Tag(tagName);
    }

    @Test
    public void getName_IsBlock_ReturnsTrue() {
        when(valueOf("div")).thenReturn(new Tag());
        assertTrue(getNameIsBlock());
    }

    @Test
    public void getName_NotBlock_ReturnsFalse() {
        when(valueOf("span")).thenReturn(new Tag());
        assertFalse(getNameNotBlock());
    }

    private boolean getNameIsBlock() {
        return valueOf("div").isBlock();
    }

    private boolean getNameNotBlock() {
        return valueOf("span").isBlock();
    }

    @Test
    public void normalName_IsValidTagName_ReturnsValidTagName() {
        when(valueOf("img")).thenReturn(new Tag());
        assertEquals("IMG", normalNameIsValidTagName());
    }

    @Test
    public void normalName_IsInvalidTagName_ReturnsNormalizedTagName() {
        when(valueOf("img")).thenReturn(new Tag());
        assertEquals("Img", normalNameIsInvalidTagName());
    }

    private String normalNameIsValidTagName() {
        return valueOf("img").normalName();
    }

    private String normalNameIsInvalidTagName() {
        return Normalizer.normalize(valueOf("img").getName());
    }

    @Test
    public void isBlock_IsFormListed_ReturnsTrue() {
        when(valueOf("form")).thenReturn(new Tag());
        assertTrue(isBlockIsFormListed());
    }

    @Test
    public void isBlock_IsNotFormListed_ReturnsFalse() {
        when(valueOf("img")).thenReturn(new Tag());
        assertFalse(isBlockIsNotFormListed());
    }

    private boolean isBlockIsFormListed() {
        return valueOf("form").isBlock();
    }

    private boolean isBlockIsNotFormListed() {
        return valueOf("img").isBlock();
    }

}