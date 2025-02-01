package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("");
        Document.OutputSettings settings = new Document.OutputSettings();
        doc.outputSettings(settings);
        assertEquals(settings, doc.outputSettings());
    }

}