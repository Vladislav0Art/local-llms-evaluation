package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestAdd_ adds to map internally {

    @Test
    public void testAdd_
    adds to

    map internally() {
        String key = "myAttr";
        Mockito.when(Attributes.internalKey(key)).thenReturn("hello");
        Attributes attributes = new Attributes();
        Map<String, Object> expectedMap = new ArrayList<>();
        expectedMap.add("hello");

        List<Object> list = Mockito.mock(List.class);
        Mockito.when(attributes.asList(Mockito.mock(Iterable.class))).thenReturn(list);

        Assertions.assertThat(attributes.add(Mockito.mock(String.class), "hello")).isEqualTo(expectedMap);
    }

}