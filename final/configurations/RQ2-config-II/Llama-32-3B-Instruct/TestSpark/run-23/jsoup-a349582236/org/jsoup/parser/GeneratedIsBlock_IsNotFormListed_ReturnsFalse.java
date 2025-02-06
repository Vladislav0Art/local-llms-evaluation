package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlock_IsNotFormListed_ReturnsFalse {

    @Mock
    private ParseSettings settings;

    public Tag valueOf(String tagName) {
        return new Tag(tagName);
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