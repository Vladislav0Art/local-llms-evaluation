package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.jsoup.Jsoup;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        String tagName1 = "span";
        String tagName2 = "span";
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();

        when(tag1.getName()).thenReturn(tagName1);
        when(tag2.getName()).thenReturn(tagName2);

        assertTrue(tag1.equals(tag2));
    }

}