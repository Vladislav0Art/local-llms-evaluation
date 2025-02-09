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
public class GeneratedConvertDocumentFromJsoupElement {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void convertDocumentFromJsoupElement() {
        org.jsoup.nodes.Element in = tagName("html", "<html><body>Hello World</body></html>");
        Document expectedDoc = parse("<html><body>Hello World</body></html>");
        W3CDom w3cDom = new W3CDom();
        Document result = w3cDom.fromJsoup(in);
        assertThat(result, is(expectedDoc));
    }

}