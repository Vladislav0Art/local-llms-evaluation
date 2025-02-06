package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSelectXpath_ConvertsToNodeList {

    @Test
    public void selectXpath_ConvertsToNodeList() {
        // Arrange
        Document doc = new Document();
        String xpath = "xpath";
        NodeList expected = new NodeList();
        Mockito.when(W3CDom.selectXpath(xpath, doc)).thenReturn(expected);
        NodeList result = W3CDom.selectXpath(xpath, doc);

        // Act

        // Assert
        assert result == expected;
    }

}