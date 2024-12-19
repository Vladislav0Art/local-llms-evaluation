package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTestDefaultSettings {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = (ParseSettings) builder.defaultSettings();
        assertEquals(ParseSettings.class, settings.getClass());
    }

}