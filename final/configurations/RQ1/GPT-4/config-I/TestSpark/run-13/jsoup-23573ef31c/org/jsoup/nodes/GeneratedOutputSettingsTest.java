package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document document = Document.createShell("https://example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);
        document.outputSettings(settings);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, document.outputSettings().syntax());
    }

}