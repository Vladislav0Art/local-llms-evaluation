package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.DocumentBuilderFactory.newInstance;
import static org.jsoup.select.Selector.empty;
import static org.jsoup.select.Selector.select;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodes_select_multiple {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void sourceNodes_select_multiple() {
        NodeList nodeList = select(".class", parse("<html><body><p class=\"class\">Hello World!</p></body></html>"));
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertThat(result.size(), equals(1));
    }

}