package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

}