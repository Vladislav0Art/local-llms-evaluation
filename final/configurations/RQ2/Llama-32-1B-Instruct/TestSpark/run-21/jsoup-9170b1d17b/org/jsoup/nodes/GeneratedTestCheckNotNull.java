package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        String attrKey = "myAttr";
        Object expectedValue = "Hello, world!";
        Mockito.when(Attributes.internalKey(attrKey)).thenReturn(expectedValue);
        Assertions.assertThat(Attributes.checkNotNull(Mockito.mock(String.class))).isEqualTo(expectedValue);
    }

}