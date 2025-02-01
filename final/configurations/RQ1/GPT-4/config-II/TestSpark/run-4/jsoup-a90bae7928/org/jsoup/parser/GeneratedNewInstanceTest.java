package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();

        assertNotNull(newInstance);
        assertNotEquals(xmlTreeBuilder, newInstance);
    }

}