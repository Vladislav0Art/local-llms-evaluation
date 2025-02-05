package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertNodeTokenTest {

    @Test
    public void insertNodeTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(new Element("test"), new Token.StartTag());
        assertNotNull(builder);
    }

}