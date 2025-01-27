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
public class GeneratedTestQuirksModeReturnsMockedString {

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
    public void testQuirksModeReturnsMockedString() {
        // Given
        QuirksMode mockedMode = mock(QuirksMode.class);
        when(createDocument()).thenReturn(document -> document.quirksMode(mockedMode));

        // When
        String actualMode = createDocument().quirksMode();

        // Then
        assertEquals(mockedMode, actualMode);
    }

}