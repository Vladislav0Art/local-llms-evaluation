package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://test.com");
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertSame(outputSettings, document.outputSettings());
    }

}