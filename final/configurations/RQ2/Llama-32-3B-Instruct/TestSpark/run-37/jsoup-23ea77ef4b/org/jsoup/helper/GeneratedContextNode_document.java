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
public class GeneratedContextNode_document {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void contextNode_document() {
        Document document = parse("<html><body>Hello World!</body></html>");
        Node node = document.getDocumentElement();
        Node result = W3CDom.contextNode(document);
        assertThat(result, node);
    }

}