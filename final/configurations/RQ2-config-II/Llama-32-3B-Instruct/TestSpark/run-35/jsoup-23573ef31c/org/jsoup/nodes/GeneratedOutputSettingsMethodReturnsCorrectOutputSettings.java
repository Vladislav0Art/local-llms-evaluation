package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOutputSettingsMethodReturnsCorrectOutputSettings {

    @Test
    public void outputSettingsMethodReturnsCorrectOutputSettings() {
        OutputSettings outputSettings = OutputSettings.createDefault();
        Document document = new Document(outputSettings);
        assertNotNull(document.outputSettings());
    }

}