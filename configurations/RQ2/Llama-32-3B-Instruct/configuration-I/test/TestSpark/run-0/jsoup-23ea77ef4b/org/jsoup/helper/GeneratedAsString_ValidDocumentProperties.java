package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsString_ValidDocumentProperties {

    @Test
    public void asString_ValidDocumentProperties() {
        Map<String, String> validProperties = new HashMap<>();
        validProperties.put("attr1", "val1");
        validProperties.put("attr2", "val2");
        String result = W3CDom.asString(Mockito.mock(Document.class), validProperties);
        assert result != null;
    }

}