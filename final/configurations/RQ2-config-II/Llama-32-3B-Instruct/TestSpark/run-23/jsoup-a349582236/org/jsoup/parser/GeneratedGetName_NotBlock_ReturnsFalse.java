package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_NotBlock_ReturnsFalse {

    @Mock
    private ParseSettings settings;

    public Tag valueOf(String tagName) {
        return new Tag(tagName);
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

}