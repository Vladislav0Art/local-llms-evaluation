package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        Document.OutputSettings outputSettings = document.outputSettings().prettyPrint(false);
        document.outputSettings(outputSettings);
        assertFalse(document.outputSettings().prettyPrint());
    }

}