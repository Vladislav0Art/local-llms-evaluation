package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestRemove_ removes from map internally {

    @Test
    public void testRemove_
    removes from

    map internally() {
        String key = "myAttr";
        Object value = "hello";

        Mockito.when(Attributes.internalKey(key)).thenReturn("value");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.remove(value.toString());

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.remove(value)).isEqualTo(expectedMap);
    }

}