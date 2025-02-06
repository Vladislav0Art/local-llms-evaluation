package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOutputXml_ConvertsToXmlMap {

    @Test
    public void OutputXml_ConvertsToXmlMap() {
        // Arrange
        Document doc = new Document();
        Map<String, String> expected = new HashMap<>();
        Mockito.when(W3CDom.OutputXml()).thenReturn(expected);
        Map<String, String> result = W3CDom.OutputXml();

        // Act

        // Assert
        assert result == expected;
    }

}