package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.jsoup.Jsoup;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestPreserveWhitespace {

    @Test
    public void testPreserveWhitespace() {
        Document document = Jsoup.parse("<span>test</span>");
        Tag tag = new Tag();
        when(tag.preserveWhitespace()).thenReturn(true);
        assertTrue(document.text().contains("test"));
    }

}