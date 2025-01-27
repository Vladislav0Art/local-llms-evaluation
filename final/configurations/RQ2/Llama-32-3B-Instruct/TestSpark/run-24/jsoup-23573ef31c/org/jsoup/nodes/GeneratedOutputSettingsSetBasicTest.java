package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedOutputSettingsSetBasicTest {

    @Test
    public void outputSettingsSetBasicTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        OutputSettings actualSettings = document.outputSettings();
        org.junit.Assert.assertEquals(settings, actualSettings);
    }

}