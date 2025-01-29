package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestHasKeyIgnoreCase_ returns true for
external attribute {

@Test
public void testHasKeyIgnoreCase_
returns true for

external attribute() {
    String key = "myAttr";
    Object value = "value";
    Mockito.when(Attributes.internalKey(key)).thenReturn(value.toString());
    Attributes attributes = new Attributes();
    Assertions.assertThat(attributes.hasKey(value.toString())).isEqualTo(true);

    // Clear mock object
    Mockito.reset(Attributes.internalKey, Mockito.times(1));
}

}