package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessEndTagTest {

    @Test
    public void processEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test"));
        xmlTreeBuilder.process(new Token.EndTag("test"));
        assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}