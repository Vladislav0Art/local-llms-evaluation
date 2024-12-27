package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsString_EmptyDocumentProperties {

    @Test
    public void asString_EmptyDocumentProperties() {
        Map<String, String> emptyProperties = new HashMap<>();
        Document validDoc = Mockito.mock(Document.class);
        String result = W3CDom.asString(validDoc, emptyProperties);
        assert result == "";
    }

}