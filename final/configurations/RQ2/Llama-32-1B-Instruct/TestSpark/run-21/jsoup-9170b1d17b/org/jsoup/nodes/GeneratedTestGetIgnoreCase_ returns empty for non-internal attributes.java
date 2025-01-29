package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGetIgnoreCase_ returns empty for non-
internal attributes {

@Test
public void testGetIgnoreCase_
returns empty for non-

internal attributes() {
    String key = "myAttr";
    Attributes attributes = new Attributes();
    Object expectedValue = "";
    Mockito.when(attributes.getIgnoreCase(key)).thenReturn(expectedValue);

    Assertions.assertThat(attributes.getIgnoreCase(key)).isEqualTo(expectedValue);
}

}