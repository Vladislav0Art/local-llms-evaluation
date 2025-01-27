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
public class GeneratedTestTitleReturnsMockedString {

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
    public void testTitleReturnsMockedString() {
        // Given
        String mockedString = "Hello World!";
        when(createDocument().title()).thenReturn(mockedString);

        // When
        String actualTitle = createDocument().title();

        // Then
        assertEquals(mockedString, actualTitle);
    }

}