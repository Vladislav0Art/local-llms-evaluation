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
public class GeneratedOuterHtmlHead_AppendsCorrectHTML {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void outerHtmlHead_AppendsCorrectHTML() {
        // Given
        String expectedHtml = "<p> Hello World </p>";
        Document document = new Document();

        // When
        textNode.outerHtmlHead(accum, 0, out);

        // Then
        assertEquals(expectedHtml, accum.toString());
    }

}