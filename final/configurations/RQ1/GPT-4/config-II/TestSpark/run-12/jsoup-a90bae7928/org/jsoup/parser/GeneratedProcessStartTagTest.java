package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessStartTagTest {

    @Test
    public void processStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test").selfClosing());
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

}