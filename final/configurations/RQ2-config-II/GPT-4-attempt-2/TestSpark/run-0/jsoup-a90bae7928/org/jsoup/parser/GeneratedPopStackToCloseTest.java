package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tag("div");
        xmlTreeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.tag("div");
        xmlTreeBuilder.popStackToClose(endTag);
        assertEquals(0, xmlTreeBuilder.getStack().size());
    }

}