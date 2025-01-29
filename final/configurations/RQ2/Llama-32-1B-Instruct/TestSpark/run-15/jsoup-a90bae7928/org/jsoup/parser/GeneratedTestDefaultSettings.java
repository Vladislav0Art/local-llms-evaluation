package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestDefaultSettings {

    @Test
    public void testDefaultSettings() {
        String baseUri = "http://example.com";
        ParseSettings defaultSettings = new XmlTreeBuilder().defaultSettings();
        assert defaultSettings.getBaseUri() == baseUri;
        assert !defaultSettings.isValidateXml();
    }

}