package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestRemoveKeyIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testRemoveKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        when(attrs.removeIgnoreCase("key")).thenReturn(true);
        assertNoMoreValues();

        verify(removeIgnoreCase, times(1)).removeIgnoreCase("key");
    }

}