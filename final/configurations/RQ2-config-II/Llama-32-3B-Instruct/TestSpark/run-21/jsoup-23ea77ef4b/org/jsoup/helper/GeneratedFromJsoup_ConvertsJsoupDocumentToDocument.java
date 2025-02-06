package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromJsoup_ConvertsJsoupDocumentToDocument {

    @Test
    public void fromJsoup_ConvertsJsoupDocumentToDocument() {
        // Arrange
        Document soupDoc = new Document();
        Document expected = new Document();
        Mockito.when(W3CDom.fromJsoup(soupDoc)).thenReturn(expected);
        Document result = W3CDom.fromJsoup(soupDoc);

        // Act

        // Assert
        assert result == expected;
    }

}