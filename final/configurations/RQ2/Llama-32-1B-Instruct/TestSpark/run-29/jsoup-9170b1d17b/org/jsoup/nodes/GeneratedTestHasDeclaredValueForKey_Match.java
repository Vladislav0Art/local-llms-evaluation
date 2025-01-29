package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.NodeAttributes;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestHasDeclaredValueForKey_Match {

    @BeforeClass
    public static void setUp() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.allowTrailingSlash = true;
        document.add(new Tag("html", settings));
        document.outputSettings().append("\n");
    }

    @Test
    public void testHasDeclaredValueForKey_Match() {
        String key = "test";
        Object value = "value";

        Attributes attributes = new Attributes();
        assertTrue(attributes.hasDeclaredValueForKey(key).equals(value));
    }

}