package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_NoTagName_ThrowsException {

    @Test
    public void createElement_NoTagName_ThrowsException() {
        // Arrange

        // Act & Assert
        assertThrows(Exception.class, () -> Document.createElement(null));
    }

}