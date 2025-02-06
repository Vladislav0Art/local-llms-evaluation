package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCreateDocumentOutputSettingsCreation {

    @Test
    public void createDocumentOutputSettingsCreation() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("http://example.com");
        document.outputSettings(outputSettings);
        assertNotNull(document.outputSettings());
    }

}