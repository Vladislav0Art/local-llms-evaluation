package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.NodeAttributes;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestHasKeyIgnoreCaseHasDeclaredValueForKey_NoMatch {

    @BeforeClass
    public static void setUp() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.allowTrailingSlash = true;
        document.add(new Tag("html", settings));
        document.outputSettings().append("\n");
    }

    @Test
    public void testHasKeyIgnoreCaseHasDeclaredValueForKey_NoMatch() {
        String key1 = "teSt";
        String value1 = "value";

        Attributes attributes = new Attributes();

        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase(key1).equals("value"));
    }

}