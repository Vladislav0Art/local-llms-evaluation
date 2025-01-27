package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestXmlTreeBuilderWithComment {

    @Test
    public void testXmlTreeBuilderWithComment() {
        // Given
        TreeBuilder treeBuilderMock = Mockito.mock(TreeBuilder.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(treeBuilderMock);

        String comment = "<!-- This is a comment -->";
        Reader reader = new StringReader(comment);

        // When
        Document document = xmlTreeBuilder.parse(reader.toString(), "");

        // Then
        assertNotNull(document);
    }

}