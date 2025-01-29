package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.NodeAttributes;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetIgnoreCase_NoMatch {

    @BeforeClass
    public static void setUp() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.allowTrailingSlash = true;
        document.add(new Tag("html", settings));
        document.outputSettings().append("\n");
    }

    @Test
    public void testGetIgnoreCase_NoMatch() {
        String key = "TeSt";
        String value = "value";

        Attributes attributes = new Attributes();
        assertFalse(attributes.getIgnoreCase(key).equals(value));
    }

}