package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDocTypeTest {

    @Test
    public void insertDocTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.attr("name", "testDoctype");
        xmlTreeBuilder.insert(doctypeToken);
        assertTrue(xmlTreeBuilder.currentElement().hasText());
    }

}