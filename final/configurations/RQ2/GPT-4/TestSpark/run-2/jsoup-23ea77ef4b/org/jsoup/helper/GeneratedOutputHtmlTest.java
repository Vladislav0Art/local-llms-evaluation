package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtmlTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> hashMap = W3CDom.OutputHtml();
        Assert.assertFalse("HashMap should not be empty", hashMap.isEmpty());
    }

}