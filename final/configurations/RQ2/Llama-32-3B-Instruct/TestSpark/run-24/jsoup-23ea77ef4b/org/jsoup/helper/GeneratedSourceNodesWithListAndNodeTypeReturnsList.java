package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodesWithListAndNodeTypeReturnsList {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void sourceNodesWithListAndNodeTypeReturnsList() {
        List<String> nodeList = new ArrayList<>();
        List<org.jsoup.nodes.Node> result = org.jsoup.helper.W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Element.class);
        assertNotNull(result);
    }

}