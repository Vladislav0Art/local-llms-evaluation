package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsString_ConvertsDocumentToStringWithProperties {

    @Test
    public void asString_ConvertsDocumentToStringWithProperties() {
        // Arrange
        Document doc = new Document();
        Map<String, String> properties = new HashMap<>();
        String expected = "string";
        Mockito.when(W3CDom.asString(doc, properties)).thenReturn(expected);
        String result = W3CDom.asString(doc, properties);

        // Act

        // Assert
        assert result == expected;
    }

}