package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("https://google.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, doc.outputSettings());
    }

}