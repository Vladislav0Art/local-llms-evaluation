package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsString_ConvertsDocumentToString {

    @Test
    public void asString_ConvertsDocumentToString() {
        // Arrange
        Document doc = new Document();
        String expected = "string";
        Mockito.when(W3CDom.asString(doc)).thenReturn(expected);
        String result = W3CDom.asString(doc);

        // Act

        // Assert
        assert result == expected;
    }

}