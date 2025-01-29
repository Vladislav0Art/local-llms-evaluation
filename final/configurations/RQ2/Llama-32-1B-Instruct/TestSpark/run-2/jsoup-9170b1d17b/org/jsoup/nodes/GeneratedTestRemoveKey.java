package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestRemoveKey {

    private String key;
    private Object value;

    @Test
    public void testRemoveKey() {
        Attributes attrs = new Attributes();
        when(attrs.remove("key")).thenReturn(true);
        assertNoMoreValues();

        verify(remove, times(1)).remove("key");
    }

}