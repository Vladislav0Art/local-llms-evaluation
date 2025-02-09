package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag().name("p");
        treeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag().name("p");
        treeBuilder.popStackToClose(endTag);
        assertTrue(treeBuilder.getStack().isEmpty());
    }

}