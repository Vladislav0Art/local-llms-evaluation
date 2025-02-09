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
public class GeneratedClone_NullDocument_ReturnsNull {

    @Mock
    private Element element;

    @Test
    public void clone_NullDocument_ReturnsNull() {
        when(element.clone()).thenReturn(null);
        Document document = new Document();
        assertNull(document.clone());
    }

}