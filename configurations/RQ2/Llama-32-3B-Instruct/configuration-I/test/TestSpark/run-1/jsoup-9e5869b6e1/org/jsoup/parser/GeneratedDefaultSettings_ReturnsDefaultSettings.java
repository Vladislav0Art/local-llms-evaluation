package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedDefaultSettings_ReturnsDefaultSettings {

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

}