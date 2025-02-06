package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedOutputSettingsSetsOutputSettings {

    @Test
    public void outputSettingsSetsOutputSettings() {
        OutputSettings settings = new org.jsoup.helper.OutputSettings();
        Document document = Document.createShell("http://example.com");
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

}