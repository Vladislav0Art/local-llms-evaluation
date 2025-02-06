package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateMetaCharsetElement_SettingUpdateSetsUpdateMetaCharsetElement {

    @Test
    public void updateMetaCharsetElement_SettingUpdateSetsUpdateMetaCharsetElement() {
        // Arrange
        Document document = new Document(null);
        boolean update = false;
        when(document.updateMetaCharsetElement(update)).thenReturn(document);

        // Act
        document.updateMetaCharsetElement(true);

        // Assert
        assertEquals(true, document.updateMetaCharsetElement());
    }

}