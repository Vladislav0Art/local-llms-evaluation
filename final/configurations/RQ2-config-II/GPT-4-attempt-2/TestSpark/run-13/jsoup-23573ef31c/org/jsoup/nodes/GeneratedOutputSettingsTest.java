package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

}