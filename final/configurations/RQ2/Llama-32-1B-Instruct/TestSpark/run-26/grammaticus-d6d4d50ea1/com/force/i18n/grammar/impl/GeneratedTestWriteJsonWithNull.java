package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestWriteJsonWithNull {

    @Test
    public void testWriteJsonWithNull() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", mock(Object.class));
        when(map.get("term1")).thenReturn(null);

        try (ObjectOutputStream out = new ObjectOutputStream(mock(InputStream.class))) {
            writeJson(out, null, null, Collections.emptySet());
        }
    }

}