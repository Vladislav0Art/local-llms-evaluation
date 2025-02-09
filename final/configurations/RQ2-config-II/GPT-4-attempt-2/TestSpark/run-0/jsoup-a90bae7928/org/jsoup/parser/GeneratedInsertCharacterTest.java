package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character token = new Token.Character();
        token.setData("test data");
        xmlTreeBuilder.insert(token);
        assertEquals("test data", ((TextNode) xmlTreeBuilder.doc.childNode(0)).getWholeText());
    }

}