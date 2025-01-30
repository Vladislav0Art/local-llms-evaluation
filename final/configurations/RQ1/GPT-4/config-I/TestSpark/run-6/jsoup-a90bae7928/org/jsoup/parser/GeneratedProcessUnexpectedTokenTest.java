package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessUnexpectedTokenTest {

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.EOF();
        Assert.assertFalse(treeBuilder.process(token));
    }

}