package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.NodeAttributes;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEquals_Match {

    @BeforeClass
    public static void setUp() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.allowTrailingSlash = true;
        document.add(new Tag("html", settings));
        document.outputSettings().append("\n");
    }

    @Test
    public void testEquals_Match() {
        String key1 = "test";
        String key2 = "test";
        Attributes attributes1 = new Attributes();
        attributes1.put(key1, "value");
        Attributes attributes2 = new Attributes();
        assertEquals(attributes1, attributes2);
    }

}