package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedQuirksMode_SettingQuirksMode_setsDocumentQuirksMode {

    @Test
    public void quirksMode_SettingQuirksMode_setsDocumentQuirksMode() {
        // Arrange
        Document document = new Document(null);
        QuirksMode quirksMode = Mockito.mock(QuirksMode.class);
        when(document.quirksMode(quirksMode)).thenReturn(document);

        // Act
        document.quirksMode(QuirksMode.CANONICAL);

        // Assert
        assertEquals(QuirksMode.CANONICAL, document.quirksMode());
    }

}