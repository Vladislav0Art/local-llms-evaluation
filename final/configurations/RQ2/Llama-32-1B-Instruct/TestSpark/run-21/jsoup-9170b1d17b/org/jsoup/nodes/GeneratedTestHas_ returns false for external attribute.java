package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestHas_ returns false for
external attribute {

@Test
public void testHas_
returns false for

external attribute() {
    String key = "myAttr";
    Mockito.when(Attributes.internalKey(key)).thenReturn("value");
    Attributes attributes = new Attributes();
    Assertions.assertThat(attributes.has(Mockito.mock(String.class))).isEqualTo(false);

    // Clear mock object
    Mockito.reset(Attributes.internalKey, Mockito.times(1));
}

}