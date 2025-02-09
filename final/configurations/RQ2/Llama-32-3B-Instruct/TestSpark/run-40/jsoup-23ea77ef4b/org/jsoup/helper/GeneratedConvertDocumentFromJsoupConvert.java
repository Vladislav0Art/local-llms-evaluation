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
public class GeneratedConvertDocumentFromJsoupConvert {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void convertDocumentFromJsoupConvert() {
        org.jsoup.nodes.Document in = parse("<html><body>Hello World</body></html>");
        Document expectedDoc = parse("<html><body>Hello World</body></html>");
        W3CDom w3cDom = new W3CDom();
        Document result = w3cDom.convert(in, expectedDoc);
        assertThat(result, is(expectedDoc));
    }

}