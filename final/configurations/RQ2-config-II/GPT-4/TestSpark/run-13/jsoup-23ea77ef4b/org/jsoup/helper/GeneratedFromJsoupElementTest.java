package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedFromJsoupElementTest {

    @Test
    public void FromJsoupElementTest() {
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document result = w3cDom.fromJsoup(element);
        Assert.assertNotNull(result);
    }

}