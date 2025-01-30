package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag><subtag>content</subtag></tag>"), "http://base.uri/",
                new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        assertFalse(xmlTreeBuilder.stack.isEmpty());
        Token.EndTag endTagToken = new Token.EndTag();
        endTagToken.tagName("tag");
        xmlTreeBuilder.popStackToClose(endTagToken);
        assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}