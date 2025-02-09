package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings settings = xmlTreeBuilder.defaultSettings();
        assertNotNull(settings);
    }

}