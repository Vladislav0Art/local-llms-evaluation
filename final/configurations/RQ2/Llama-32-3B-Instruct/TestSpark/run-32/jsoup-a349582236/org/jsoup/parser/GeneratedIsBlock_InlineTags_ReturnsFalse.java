package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsBlock_InlineTags_ReturnsFalse {

    @Test
    public void isBlock_InlineTags_ReturnsFalse() {
        Tag tag = new Tag("p");
        assertFalse(tag.isBlock());
    }

}