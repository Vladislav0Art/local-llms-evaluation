package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedConvert_PassesConversion {

    @Test
    public void convert_PassesConversion() {
        Document soup = Document.create("html");
        Document dom = W3CDom.convert(soup);
        dom.appendChild(soup.importNode(soup.getElementsByTagName("body").item(0), true));
        Assert.assertTrue(W3CDom.convert(soup).contains(dom));
    }

}