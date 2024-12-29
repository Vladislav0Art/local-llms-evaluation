package org.jsoup.parser;

public class GeneratedDefaultSettings_ReturnsDefaultSettings {

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        ParseSettings settings = new XmlTreeBuilder().defaultSettings();
        assertNotNull(settings);
    }

}