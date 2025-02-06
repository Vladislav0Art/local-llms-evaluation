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
public class GeneratedSourceNodesReturnsList {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void sourceNodesReturnsList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> expectedList = new ArrayList<>();
        expectedList.add(new Node());
        W3CDom.List<Node> actual = W3CDom.sourceNodes(nodeList, Node.class);
        assert actual.get(0) == expectedList.get(0);
    }

}