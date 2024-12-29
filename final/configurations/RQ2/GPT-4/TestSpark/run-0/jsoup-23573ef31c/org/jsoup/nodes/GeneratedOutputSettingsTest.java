package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("https://www.example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

}