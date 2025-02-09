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
public class GeneratedCreateShell_NullBaseUri_ReturnsNull {

    @Mock
    private Element element;

    @Test
    public void createShell_NullBaseUri_ReturnsNull() {
        when(element.constructor(anyString())).thenReturn(null);
        Document document = Document.createShell(null);
        assertNull(document);
    }

}