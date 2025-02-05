package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName("html");
        treeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName("html");
        treeBuilder.popStackToClose(endTag);
        assertFalse(treeBuilder.getStack().contains(startTag));
    }

}