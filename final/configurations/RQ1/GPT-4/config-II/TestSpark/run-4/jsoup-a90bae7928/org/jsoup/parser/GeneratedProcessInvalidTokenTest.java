package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessInvalidTokenTest {

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token invalidToken = new Token.EOF();

        xmlTreeBuilder.process(invalidToken);
    }

}