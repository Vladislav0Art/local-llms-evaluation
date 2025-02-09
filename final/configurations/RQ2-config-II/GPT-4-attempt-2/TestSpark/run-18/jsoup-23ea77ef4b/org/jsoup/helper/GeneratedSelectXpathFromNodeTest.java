package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathFromNodeTest {

    @Test
    public void selectXpathFromNodeTest() throws Exception {
        W3CDom dom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        NodeList nodeList = dom.selectXpath("/path", node);
        assertNotNull(nodeList);
    }

}