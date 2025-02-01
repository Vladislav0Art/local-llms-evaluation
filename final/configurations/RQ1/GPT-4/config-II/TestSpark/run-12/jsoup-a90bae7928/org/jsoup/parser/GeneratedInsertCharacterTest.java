package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Character("Test"));
        assertEquals("Test", xmlTreeBuilder.doc.childNode(0).outerHtml());
    }

}