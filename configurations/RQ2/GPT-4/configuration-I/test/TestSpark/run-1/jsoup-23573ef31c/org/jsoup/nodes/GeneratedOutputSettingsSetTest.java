package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOutputSettingsSetTest {

    @Test
    public void outputSettingsSetTest() {
        Document document = new Document("http://baseUri");
        OutputSettings outputSettings = new OutputSettings();
        document = document.outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}