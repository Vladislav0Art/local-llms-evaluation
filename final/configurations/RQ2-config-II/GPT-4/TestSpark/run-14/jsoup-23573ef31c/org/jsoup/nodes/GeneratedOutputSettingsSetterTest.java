package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedOutputSettingsSetterTest {

    @Test
    public void outputSettingsSetterTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        assertSame(settings, document.outputSettings());
    }

}