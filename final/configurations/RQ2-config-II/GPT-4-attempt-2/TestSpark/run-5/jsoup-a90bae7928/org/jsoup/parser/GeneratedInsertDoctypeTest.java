package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        xmlTreeBuilder.insert(doctype);
        // Assert successful doctype insertion
    }

}