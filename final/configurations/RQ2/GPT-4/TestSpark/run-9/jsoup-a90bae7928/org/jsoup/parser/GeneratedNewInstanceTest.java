package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newXmlTreeBuilder = xmlTreeBuilder.newInstance();

        // verify new instance creation
        assertNotSame(xmlTreeBuilder, newXmlTreeBuilder);
    }

}