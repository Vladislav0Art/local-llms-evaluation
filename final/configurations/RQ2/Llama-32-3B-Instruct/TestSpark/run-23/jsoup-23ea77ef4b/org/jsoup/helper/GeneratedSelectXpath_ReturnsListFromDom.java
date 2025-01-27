package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedSelectXpath_ReturnsListFromDom {

    @Test
    public void selectXpath_ReturnsListFromDom() {
        Document soup = Document.create("html");
        Element element = soup.createElement("div");
        soup.appendChild(element);
        NodeList result = W3CDom.selectXpath("//div", soup);
        Assert.assertNotNull(result);
    }

}