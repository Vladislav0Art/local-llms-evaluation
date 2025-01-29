package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGet_ returns null for
external attribute {

@Test
public void testGet_
returns null for

external attribute() {
    String key = "myAttr";
    Object value = "value";
    Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
    Attributes attributes = new Attributes();
    Object expectedValue = null;
    Assertions.assertThat(attributes.get(Mockito.mock(String.class))).isEqualTo(expectedValue);

    // Clear mock object
    Mockito.reset(Attributes.internalKey, Mockito.times(1));
}

}