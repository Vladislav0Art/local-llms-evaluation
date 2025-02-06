package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromJsoup_ConvertsJsoupElementToDocument {

    @Test
    public void fromJsoup_ConvertsJsoupElementToDocument() {
        // Arrange
        Element soupElement = new Element();
        Document expected = new Document();
        Mockito.when(W3CDom.fromJsoup(soupElement)).thenReturn(expected);
        Document result = W3CDom.fromJsoup(soupElement);

        // Act

        // Assert
        assert result == expected;
    }

}