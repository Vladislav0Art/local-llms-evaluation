package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestWriteJsonWithEmptySet {

    @Test
    public void testWriteJsonWithEmptySet() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", mock(Object.class));
        when(map.get("term1")).thenReturn(mock(String.class));

        try (ObjectOutputStream out = new ObjectOutputStream(mock(InputStream.class))) {
            writeJson(out, null, Collections.emptySet(), map);
        }
    }

}