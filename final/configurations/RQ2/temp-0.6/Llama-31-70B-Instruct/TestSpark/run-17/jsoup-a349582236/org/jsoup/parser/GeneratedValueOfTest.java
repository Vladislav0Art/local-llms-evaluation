package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = new Tag();
        String tagName = "a";
        ParseSettings settings = mock(ParseSettings.class);
        Tag valueOf = tag.valueOf(tagName, settings);
        assertEquals(tagName, valueOf.getName());
    }

}