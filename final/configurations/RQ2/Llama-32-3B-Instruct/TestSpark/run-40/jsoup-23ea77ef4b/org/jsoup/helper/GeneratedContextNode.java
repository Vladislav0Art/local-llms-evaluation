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
public class GeneratedContextNode {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void contextNode() {
        Document wDoc = Mockito.mock(Document.class);
        Node expectedContextNode = Mockito.mock(Node.class);
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(wDoc);
        assertThat(result, is(expectedContextNode));
    }

}