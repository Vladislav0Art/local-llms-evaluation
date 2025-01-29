package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentBuilder;
import org.jsoup.nodes.DocumentFragment;
import org.jsoup.nodes.DocumentBuilder.Element;

public class GeneratedTestSelectXpath {

    @Test
    public void testSelectXpath() {
        Document doc = neworg.jsoup.nodes.DocumentBuilder().build("<html><body>comment1<comment2/>(<span>test</span>)</span>");
        String html = "<html><body>comment1<comment2/>(<span>test</span>)</span>";
        NodeList nodeList = W3CDom.selectXpath("comment", doc);
        Assert.assertTrue(nodeList.getLength() == 4);
    }

}