package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertEqual(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

}