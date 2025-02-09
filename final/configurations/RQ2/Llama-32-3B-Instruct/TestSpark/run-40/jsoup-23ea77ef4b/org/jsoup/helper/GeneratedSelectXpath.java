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
public class GeneratedSelectXpath {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void selectXpath() {
        Document doc = parse("<html><body>Hello World</body></html>");
        NodeList expectedNodeList = Mockito.mock(NodeList.class);
        W3CDom w3cDom = new W3CDom();
        NodeList result = w3cDom.selectXpath("//body", doc);
        assertThat(result, is(expectedNodeList));
    }

}