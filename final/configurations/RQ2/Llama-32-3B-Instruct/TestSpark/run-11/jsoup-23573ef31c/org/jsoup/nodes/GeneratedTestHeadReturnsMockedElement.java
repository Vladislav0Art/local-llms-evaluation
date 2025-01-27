package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestHeadReturnsMockedElement {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private OutputSettings outputSettings;

    @Mock
    private QuirksMode quirksMode;

    public Document createDocument() {
        return new Document("https://example.com");
    }

    @Test
    public void testHeadReturnsMockedElement() {
        // Given
        Element mockedElement = mock(Element.class);
        when(createDocument().head()).thenReturn(mockedElement);

        // When
        Document document = createDocument();
        Element actualHead = document.head();

        // Then
        assertEquals(mockedElement, actualHead);
    }

}