package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeWithUnmatchedNodeAndTokenTest {

    @Test
    public void insertNodeWithUnmatchedNodeAndTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new Element(Tag.valueOf("Test"));
        Token token = new Token(Tag.valueOf("Test1"), String.valueOf("Test1"));
        xmlTreeBuilder.insertNode(node, token);
    }

}