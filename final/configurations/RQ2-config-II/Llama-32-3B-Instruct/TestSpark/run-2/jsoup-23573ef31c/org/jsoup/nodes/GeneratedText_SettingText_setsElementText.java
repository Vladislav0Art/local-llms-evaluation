package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_SettingText_setsElementText {

    @Test
    public void text_SettingText_setsElementText() {
        // Arrange
        Document document = new Document(null);
        String text = "Example Text";
        when(document.text(text)).thenReturn(document);

        // Act
        document.text(text);

        // Assert
        assertEquals(text, document.text());
    }

}