package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestHead {

    @Test
    public void testHead() {
        // Arrange
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.head()).thenReturn(null);

        // Act
        Element head = document.head();

        // Assert
        assertNull(head);
    }

}