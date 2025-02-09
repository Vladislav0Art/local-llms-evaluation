package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://google.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

}