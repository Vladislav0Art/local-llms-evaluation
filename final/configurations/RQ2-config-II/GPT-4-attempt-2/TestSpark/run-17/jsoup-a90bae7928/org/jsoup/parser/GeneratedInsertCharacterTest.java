package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character());
        // the method doesn't return a value, so we have to verify it doesn't throw exceptions
    }

}