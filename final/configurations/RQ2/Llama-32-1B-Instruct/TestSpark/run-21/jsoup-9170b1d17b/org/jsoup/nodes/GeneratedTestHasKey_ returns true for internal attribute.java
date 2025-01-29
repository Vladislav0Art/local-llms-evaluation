package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestHasKey_ returns true for
internal attribute {

@Test
public void testHasKey_
returns true for

internal attribute() {
    String key = "myAttr";
    Mockito.when(Attributes.internalKey(key)).thenReturn("value");
    Attributes attributes = new Attributes();
    Assertions.assertThat(attributes.hasKey(Mockito.mock(String.class))).isEqualTo(true);

    // Clear mock object
    Mockito.reset(Attributes.internalKey, Mockito.times(1));
}

}