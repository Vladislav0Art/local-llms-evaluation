package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedOutputSettings_setsAndGetsOutputSettings {

    @Test
    public void outputSettings_setsAndGetsOutputSettings() {
        OutputSettings outputSettings = OutputSettings.create();
        Document document = new Document("https://example.com");
        document.outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}