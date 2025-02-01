package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-8");
        doc.outputSettings(settings);
        assertEquals(settings, doc.outputSettings());
    }

}