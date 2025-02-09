package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOutputSettingsSetterTest {

    @Test
    public void outputSettingsSetterTest() throws IOException {
        OutputSettings settings = new OutputSettings();
        Document document = new Document();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

}