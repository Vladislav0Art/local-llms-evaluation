package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertToOutElementTest {

    @Test
    public void convertToOutElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element in = Mockito.mock(Element.class);
        Document out = Mockito.mock(Document.class);
        w3CDom.convert(in, out);
        Assert.assertNotNull(out);
    }

}