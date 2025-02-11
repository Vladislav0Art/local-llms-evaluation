package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewInstance_ReturnsCorrectXmlTreeBuilder {

    @Test
    public void newInstance_ReturnsCorrectXmlTreeBuilder() {
        XmlTreeBuilder expectedBuilder = new XmlTreeBuilder();
        XmlTreeBuilder actualBuilder = new XmlTreeBuilder();

        assertEquals(expectedBuilder, actualBuilder.newInstance());
    }

}