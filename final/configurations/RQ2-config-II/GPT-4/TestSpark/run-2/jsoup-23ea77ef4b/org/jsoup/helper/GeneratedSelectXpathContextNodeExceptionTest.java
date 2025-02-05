package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSelectXpathContextNodeExceptionTest {

    @Test
    public void selectXpathContextNodeExceptionTest() {
        W3CDom w3CDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        w3CDom.selectXpath("InvalidXpath", node);
    }

}