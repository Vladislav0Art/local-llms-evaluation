package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsInline_BlockTags_ReturnsFalse {

    @Test
    public void isInline_BlockTags_ReturnsFalse() {
        Tag tag = new Tag("div");
        assertFalse(tag.isInline());
    }

}