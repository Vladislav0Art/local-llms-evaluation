package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.jsoup.Jsoup;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        String tagName = "span";
        Tag tag = new Tag();
        when(tag.getName()).thenReturn(tagName);
        assertEquals(tagName, tag.getName());
    }

}