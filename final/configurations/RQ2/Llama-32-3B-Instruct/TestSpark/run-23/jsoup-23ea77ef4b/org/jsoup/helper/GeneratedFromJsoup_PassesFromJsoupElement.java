package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedFromJsoup_PassesFromJsoupElement {

    @Test
    public void fromJsoup_PassesFromJsoupElement() {
        Document soup = Document.create("html");
        Element element = soup.createElement("div");
        Document dom = W3CDom.fromJsoup(element);
        Assert.assertNotNull(dom);
    }

}