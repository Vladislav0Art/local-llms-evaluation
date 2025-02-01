package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<test></test>"), "", null);
        assertNotNull(xmlTreeBuilder);
    }

}