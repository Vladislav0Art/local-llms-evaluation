package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTitle_SetTitle_ReturnsPreviousValue {

    @Mock
    private Element element;

    @Test
    public void title_SetTitle_ReturnsPreviousValue() {
        String previousTitle = "Hello World";
        when(element.title(anyString())).thenReturn(previousTitle);
        Document document = new Document();
        document.title("New Title");
        assertEquals(previousTitle, document.title());
    }

}