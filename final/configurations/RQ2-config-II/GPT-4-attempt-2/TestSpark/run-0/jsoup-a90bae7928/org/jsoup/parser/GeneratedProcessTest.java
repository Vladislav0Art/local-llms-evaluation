package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.StartTag();
        token.tag("div");
        xmlTreeBuilder.process(token);
        assertEquals("div", xmlTreeBuilder.getStack().getFirst().nodeName());
    }

}