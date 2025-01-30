package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.stack.add(new Element.Tag("body", ""));
        Token.EndTag endTag = new Token.EndTag("body");
        treeBuilder.popStackToClose(endTag);
        assertTrue(treeBuilder.stack.isEmpty());
    }

}