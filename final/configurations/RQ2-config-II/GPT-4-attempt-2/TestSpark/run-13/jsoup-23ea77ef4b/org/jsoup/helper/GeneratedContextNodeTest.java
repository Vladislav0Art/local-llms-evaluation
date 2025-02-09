package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom testInstance = new W3CDom();
        org.w3c.dom.Document wDoc = Mockito.mock(org.w3c.dom.Document.class);
        assertNotNull(testInstance.contextNode(wDoc));
    }

}