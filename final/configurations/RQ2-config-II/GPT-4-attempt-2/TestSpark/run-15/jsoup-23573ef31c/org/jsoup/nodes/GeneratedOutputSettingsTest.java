package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        String baseUri = "http://www.website.com";
        Document doc = new Document(baseUri);
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.indentAmount(4);

        doc.outputSettings(settings);

        Assert.assertEquals(4, doc.outputSettings().indentAmount());
    }

}