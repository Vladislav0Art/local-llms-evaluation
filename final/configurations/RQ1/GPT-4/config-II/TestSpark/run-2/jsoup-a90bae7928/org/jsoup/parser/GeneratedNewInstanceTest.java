package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();

        assertEquals(XmlTreeBuilder.class, newInstance.getClass());
    }

}