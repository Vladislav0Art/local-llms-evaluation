package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedOutputSettings_ReturnsOutputSettingsInstance {

    @Test
    public void outputSettings_ReturnsOutputSettingsInstance() {
        Document document = new Document("https://www.example.com");
        OutputSettings settings = document.outputSettings();
        assertNotNull(settings);
    }

}