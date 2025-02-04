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
public class GeneratedIsBlank_GivenNonEmptyString_ReturnsFalse {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void isBlank_GivenNonEmptyString_ReturnsFalse() {
        // Given
        String nonEmptyText = "Hello World";

        // When
        boolean result = textNode.isBlank(nonEmptyText);

        // Then
        assertFalse(result);
    }

}