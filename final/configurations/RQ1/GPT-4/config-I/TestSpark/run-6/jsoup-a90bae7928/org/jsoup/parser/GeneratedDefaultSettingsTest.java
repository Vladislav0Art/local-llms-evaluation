package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Assert.assertEquals(ParseSettings.preserveCase, treeBuilder.defaultSettings());
    }

}