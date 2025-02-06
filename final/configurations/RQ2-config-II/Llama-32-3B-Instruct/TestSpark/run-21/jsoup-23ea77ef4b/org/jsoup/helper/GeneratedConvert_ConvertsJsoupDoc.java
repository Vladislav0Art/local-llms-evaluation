package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ConvertsJsoupDoc {

    @Test
    public void convert_ConvertsJsoupDoc() {
        // Arrange
        Document soupDoc = new Document();
        Document expected = new Document();
        Mockito.when(W3CDom.convert(soupDoc)).thenReturn(expected);
        Document result = W3CDom.convert(soupDoc);

        // Act

        // Assert
        assert result == expected;
    }

}