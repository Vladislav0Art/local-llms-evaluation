package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        Token.Character characterToken = new Token.Character();
        characterToken.appendData("CharData");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(characterToken);
        Assert.assertNotNull(xmlTreeBuilder);
    }

}