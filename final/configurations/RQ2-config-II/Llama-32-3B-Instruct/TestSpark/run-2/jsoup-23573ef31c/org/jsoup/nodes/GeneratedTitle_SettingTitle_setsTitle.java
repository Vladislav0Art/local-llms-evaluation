package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTitle_SettingTitle_setsTitle {

    @Test
    public void title_SettingTitle_setsTitle() {
        // Arrange
        Document document = new Document(null);
        String title = "Example Title";
        when(document.title()).thenReturn(title);

        // Act
        document.title(title);

        // Assert
        assertEquals(title, document.title());
    }

}