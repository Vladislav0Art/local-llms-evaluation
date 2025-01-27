package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedNewInstance_GivenNoSettings_ReturnsNewInstance {

    @Test
    public void newInstance_GivenNoSettings_ReturnsNewInstance() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newTreeBuilder = treeBuilder.newInstance();
        assertNotNull(newTreeBuilder);
        assertNotSame(treeBuilder, newTreeBuilder);
    }

}