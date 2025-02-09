package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        Assert.assertSame(outputSettings, doc.outputSettings());
    }

}