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

public class GeneratedContextNodeNullTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void contextNodeNullTest() {
        w3CDom.contextNode(null);
    }

}