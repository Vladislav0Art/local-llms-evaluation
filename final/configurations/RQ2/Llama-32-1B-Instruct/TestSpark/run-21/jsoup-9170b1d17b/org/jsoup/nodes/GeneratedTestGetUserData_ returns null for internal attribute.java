package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGetUserData_ returns null for
internal attribute {

@Test
public void testGetUserData_
returns null for

internal attribute() {
    String key = "myAttr";
    Mockito.when(Attributes.internalKey(key)).thenReturn(null);
    Object expectedValue = null;
    Assertions.assertThat(Attributes.getUserData(Mockito.mock(String.class))).isEqualTo(expectedValue);
}

}