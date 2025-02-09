package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedOutputSettingsTest {

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("");
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.prettyPrint(false);
        doc.outputSettings(outputSettings);

        assertEquals(outputSettings.prettyPrint(), doc.outputSettings().prettyPrint());
    }

}