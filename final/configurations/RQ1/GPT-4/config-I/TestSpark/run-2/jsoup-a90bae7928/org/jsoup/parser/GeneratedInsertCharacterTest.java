package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        Token.Character character = new Token.Character();
        character.appendData("example");
        xmlTreeBuilder.insert(character);
        List<Node> childNodes = xmlTreeBuilder.getStack().get(0).childNodes();
        assertEquals(1, childNodes.size());
        assertTrue(childNodes.get(0) instanceof TextNode);
    }

}