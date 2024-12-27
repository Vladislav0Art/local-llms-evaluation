package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();

        assertNotNull(settings);
    }

}