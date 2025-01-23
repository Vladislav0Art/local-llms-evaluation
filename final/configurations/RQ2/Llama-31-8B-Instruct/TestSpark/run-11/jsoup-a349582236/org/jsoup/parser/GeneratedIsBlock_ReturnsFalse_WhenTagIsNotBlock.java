package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlock_ReturnsFalse_WhenTagIsNotBlock {

    @Test
    public void isBlock_ReturnsFalse_WhenTagIsNotBlock() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

}