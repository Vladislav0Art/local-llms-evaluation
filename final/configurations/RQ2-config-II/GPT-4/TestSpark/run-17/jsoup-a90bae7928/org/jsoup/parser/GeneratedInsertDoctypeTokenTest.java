package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertDoctypeTokenTest {

    @Test
    public void insertDoctypeTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype());
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

}