package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedOutputSettingsSetTest {

    @Test
    public void outputSettingsSetTest() {
        Document document = new Document("http://localhost");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

}