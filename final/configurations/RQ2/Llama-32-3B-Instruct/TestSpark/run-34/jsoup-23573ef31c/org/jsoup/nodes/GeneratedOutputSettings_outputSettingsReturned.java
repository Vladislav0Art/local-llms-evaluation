package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedOutputSettings_outputSettingsReturned {

    @Test
    public void outputSettings_outputSettingsReturned() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell(outputSettings.toString());
        assertEquals(outputSettings, document.outputSettings());
    }

}