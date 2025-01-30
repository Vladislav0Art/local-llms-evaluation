package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessCharacterDataTest {

    @Test
    public void processCharacterDataTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.Comment();
        token.data("Test comment data");
        Assert.assertTrue(treeBuilder.process(token));
    }

}