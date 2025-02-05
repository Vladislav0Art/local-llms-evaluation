package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://test.com");

        Document.OutputSettings outputSettings = new Document.OutputSettings();
        doc.outputSettings(outputSettings);

        assertEquals(outputSettings, doc.outputSettings());
    }

}