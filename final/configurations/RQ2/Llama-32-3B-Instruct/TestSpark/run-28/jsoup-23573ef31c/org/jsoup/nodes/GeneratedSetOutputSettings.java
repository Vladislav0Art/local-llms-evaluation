package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetOutputSettings {

    @Test
    public void setOutputSettings() {
        Document document = new Document("https://www.example.com");
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertNotNull(document.outputSettings());
    }

}