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
public class GeneratedAsString_document_with_properties {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void asString_document_with_properties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("indent", "none");
        Document document = parse("<html><body>Hello World!</body></html>");
        String result = W3CDom.asString(document, properties);
        assertThat(result, equals("<html><body>Hello World!</body></html>\n"));
    }

}