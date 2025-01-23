package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFormatAsBlock_ReturnsFalse_WhenTagIsNotBlock {

    public static class TagImpl extends Tag {
        public TagImpl(String name) {
            super(name);
        }
    }

    @Test
    public void formatAsBlock_ReturnsFalse_WhenTagIsNotBlock() {
        Tag tag = new TagImpl("span");
        assertFalse(tag.formatAsBlock());
    }

}