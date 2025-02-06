package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateShellDocumentOutputSettingsTest {

    @Test
    public void createShellDocumentOutputSettingsTest() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell(outputSettings);
        assertNotNull(document);
    }

}