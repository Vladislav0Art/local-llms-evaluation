package org.jsoup.parser;

public class GeneratedTestDefaultSettings {

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();
        assertEquals(3, parseSettings.getDepth());
    }

}