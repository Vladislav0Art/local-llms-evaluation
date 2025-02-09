package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://outputsettingstest.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

}