package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessUnexpectedTokenTest {

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.EOF());
    }

}