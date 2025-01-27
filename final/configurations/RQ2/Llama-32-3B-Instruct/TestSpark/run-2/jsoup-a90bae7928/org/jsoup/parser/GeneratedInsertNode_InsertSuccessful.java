package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedInsertNode_InsertSuccessful {

    @Test
    public void insertNode_InsertSuccessful() {
        // Arrange
        Node node = mock(Node.class);
        when(parser.insert(node)).thenReturn(new Element());

        // Act

        // Assert
    }

}