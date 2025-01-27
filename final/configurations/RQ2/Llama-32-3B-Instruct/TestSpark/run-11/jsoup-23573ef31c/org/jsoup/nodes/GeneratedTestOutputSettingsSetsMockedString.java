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
public class GeneratedTestOutputSettingsSetsMockedString {

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
    public void testOutputSettingsSetsMockedString() {
        // Given
        OutputSettings mockedSettings = mock(OutputSettings.class);
        when(createDocument()).thenReturn(document -> document.outputSettings(mockedSettings));

        // When
        String actualSetting = createDocument().outputSettings();

        // Then
        assertEquals(mockedSettings, actualSetting);
    }

}