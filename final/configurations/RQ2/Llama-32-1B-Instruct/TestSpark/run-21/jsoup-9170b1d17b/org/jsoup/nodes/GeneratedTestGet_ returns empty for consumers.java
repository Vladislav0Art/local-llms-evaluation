package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGet_ returns empty for

consumers {

    @Test
    public void testGet_ returns empty for consumers() {
        String key = "myAttr";
        Attributes attributes = new Attributes();
        Object expectedValue = "";
        Mockito.when(attributes.get(key)).thenReturn(expectedValue);

        Assertions.assertThat(attributes.get(key)).isEqualTo(expectedValue);
    }

}