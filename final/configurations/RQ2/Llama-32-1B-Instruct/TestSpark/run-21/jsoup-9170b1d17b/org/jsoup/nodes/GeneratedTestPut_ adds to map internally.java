package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestPut_ adds to map internally {

    @Test
    public void testPut_
    adds to

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.put(value.toString(), "hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.put(value)).isEqualTo(expectedMap);
    }

}