package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertTokenCharacterTest {

    @Test
    public void insertTokenCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        Token.Character characterToken = new Token.Character();
        xmlTreeBuilder.insert(characterToken);
        assertNotNull(xmlTreeBuilder.stack.get(0));
    }

}