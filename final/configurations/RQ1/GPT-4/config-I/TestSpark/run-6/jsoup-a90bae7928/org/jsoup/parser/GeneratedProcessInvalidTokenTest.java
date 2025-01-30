package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Token;

public class GeneratedProcessInvalidTokenTest {

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Assert.assertTrue(treeBuilder.process(new Token()));
    }

}