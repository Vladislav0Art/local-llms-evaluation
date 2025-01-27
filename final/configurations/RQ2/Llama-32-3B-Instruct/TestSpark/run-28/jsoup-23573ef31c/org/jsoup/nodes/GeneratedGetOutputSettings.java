package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetOutputSettings {

    @Test
    public void getOutputSettings() {
        Document document = new Document("https://www.example.com");
        OutputSettings outputSettings = document.outputSettings();
        assertNotNull(outputSettings);
    }

}