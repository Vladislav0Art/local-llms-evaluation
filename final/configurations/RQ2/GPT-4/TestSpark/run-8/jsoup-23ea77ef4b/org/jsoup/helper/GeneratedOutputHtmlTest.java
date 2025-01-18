package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        Assert.assertNotNull(W3CDom.OutputHtml());
    }

}