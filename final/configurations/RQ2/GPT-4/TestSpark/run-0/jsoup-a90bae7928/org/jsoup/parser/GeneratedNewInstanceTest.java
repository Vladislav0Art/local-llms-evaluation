package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder copy = builder.newInstance();
        // check if the new instance is not null
        assertNotNull(copy);
    }

}