package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathReturnsNodeListWithContext {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void selectXpathReturnsNodeListWithContext() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        String xpath = "some/xpath";
        Document doc = new Document();
        Node contextNode = Mockito.mock(Node.class);
        W3CDom.NodeList actual = W3CDom.selectXpath(xpath, contextNode);
        assert actual != null;
        Mockito.verify(nodeList).size();
    }

}