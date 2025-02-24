package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlockTest {

    private static Tag tag;
    private static Document document;
    private static Element element;
    private static ParseSettings parseSettings;

    @BeforeClass
    public static void setUp() {
        tag = Tag.valueOf("div");
        document = new Document("");
        element = document.createElement("div");
        parseSettings = Mockito.mock(ParseSettings.class);
    }

    @Test
    public void isBlockTest() {
        assertTrue(Tag.valueOf("h3").isBlock());
    }

}