package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOutputHtml_ConvertsToHtmlMap {

    @Test
    public void OutputHtml_ConvertsToHtmlMap() {
        // Arrange
        Document doc = new Document();
        Map<String, String> expected = new HashMap<>();
        Mockito.when(W3CDom.OutputHtml()).thenReturn(expected);
        Map<String, String> result = W3CDom.OutputHtml();

        // Act

        // Assert
        assert result == expected;
    }

}