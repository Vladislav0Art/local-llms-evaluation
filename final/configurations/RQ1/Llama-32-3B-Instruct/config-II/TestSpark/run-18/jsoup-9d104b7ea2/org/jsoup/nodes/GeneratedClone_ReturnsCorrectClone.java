package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_ReturnsCorrectClone {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void clone_ReturnsCorrectClone() {
        // Given
        String expectedText = "Hello World";

        // When
        TextNode result = textNode.clone();

        // Then
        assertNotNull(result);
        assertEquals(expectedText, result.value().text());
    }

}