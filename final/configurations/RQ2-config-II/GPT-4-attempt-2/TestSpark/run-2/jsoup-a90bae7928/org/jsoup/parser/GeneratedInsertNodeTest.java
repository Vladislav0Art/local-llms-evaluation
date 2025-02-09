package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(new Token.StartTag());
    }

}