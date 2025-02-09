package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

}