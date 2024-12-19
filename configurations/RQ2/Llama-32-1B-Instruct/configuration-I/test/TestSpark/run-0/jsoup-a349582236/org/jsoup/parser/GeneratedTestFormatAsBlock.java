package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.jsoup.Jsoup;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        Tag tag = new Tag();
        when(tag.formatAsBlock()).thenReturn(false);
        assertFalse(tag.formatAsBlock());
    }

}