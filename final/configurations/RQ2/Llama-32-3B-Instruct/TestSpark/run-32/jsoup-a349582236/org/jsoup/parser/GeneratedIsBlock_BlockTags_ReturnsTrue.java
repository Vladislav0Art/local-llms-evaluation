package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsBlock_BlockTags_ReturnsTrue {

    @Test
    public void isBlock_BlockTags_ReturnsTrue() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}