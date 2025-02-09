package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.defaultSettings());
    }

}