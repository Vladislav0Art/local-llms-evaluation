package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedOutputSettingsReturnsOutputSettingsCorrectly {

    @Test
    public void outputSettingsReturnsOutputSettingsCorrectly() {
        OutputSettings settings = new OutputSettings();
        Document doc = new Document();
        doc.outputSettings(settings);
        assertEquals(settings, doc.outputSettings());
    }

}