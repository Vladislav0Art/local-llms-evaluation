package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("test");
        builder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("test");
        builder.popStackToClose(endTag);
        assertEquals(builder.getStack().size(), 0);
    }

}