package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Tag("root", Tag.valueOf("root")));
        xmlTreeBuilder.popStackToClose("root");
        Assert.assertEquals("Check stack after closing", 0, xmlTreeBuilder.stack.size());
    }

}