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
public class GeneratedGetWholeTextReturnsUnencodedText {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void getWholeTextReturnsUnencodedText() {
        // Given
        String encodedText = "&lt;Hello&gt; World";

        // When
        String result = textNode.getWholeText();

        // Then
        assertEquals("Hello World", result);
    }

}