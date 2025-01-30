package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<div><p>Hello</p></div>"), "http://base.uri", new Parser(treeBuilder));
        treeBuilder.runParser();
        Element pElement = treeBuilder.getStack().get(2);
        treeBuilder.popStackToClose(new Token.EndTag(pElement.tagName()));
        Assert.assertFalse(treeBuilder.getStack().contains(pElement));
    }

}