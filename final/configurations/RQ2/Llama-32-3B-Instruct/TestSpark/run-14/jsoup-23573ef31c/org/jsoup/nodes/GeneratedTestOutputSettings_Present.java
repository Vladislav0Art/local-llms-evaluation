package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestOutputSettings_Present {

    @Test
    public void testOutputSettings_Present() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertNotNull(document.outputSettings());
    }

}