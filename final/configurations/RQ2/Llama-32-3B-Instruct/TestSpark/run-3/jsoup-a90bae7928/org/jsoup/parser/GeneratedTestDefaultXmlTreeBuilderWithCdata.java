package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestDefaultXmlTreeBuilderWithCdata {

    @Test
    public void testDefaultXmlTreeBuilderWithCdata() {
        // Given
        TreeBuilder treeBuilderMock = Mockito.mock(TreeBuilder.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(treeBuilderMock);

        xmlTreeBuilder.defaultSettings().useCdata(true);

        // When
        Document document = xmlTreeBuilder.parse("<html><body>Hello World!</body></html>", "");

        // Then
        assertNotNull(document);
    }

}