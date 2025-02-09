package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.Element.tagName;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodes {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void sourceNodes() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<org.jsoup.nodes.Node> expectedNodes = Mockito.mock(List.class);
        W3CDom w3cDom = new W3CDom();
        List<org.jsoup.nodes.Node> result = w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertThat(result, is(expectedNodes));
    }

}