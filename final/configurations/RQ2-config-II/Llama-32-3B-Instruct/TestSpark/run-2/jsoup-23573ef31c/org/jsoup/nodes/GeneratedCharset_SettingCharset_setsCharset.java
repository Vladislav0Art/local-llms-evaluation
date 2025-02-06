package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset_SettingCharset_setsCharset {

    @Test
    public void charset_SettingCharset_setsCharset() {
        // Arrange
        Document document = new Document(null);
        Charset charset = Mockito.mock(Charset.class);
        when(document.charset(charset)).thenReturn(document);

        // Act
        document.charset(charset);

        // Assert
        assertEquals(charset, document.charset());
    }

}