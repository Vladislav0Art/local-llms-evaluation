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
public class GeneratedAsString {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void asString() {
        Document doc = parse("<html><body>Hello World</body></html>");
        String expectedString = "Hello World";
        W3CDom w3cDom = new W3CDom();
        String result = w3cDom.asString(doc);
        assertThat(result, is(expectedString));
    }

}