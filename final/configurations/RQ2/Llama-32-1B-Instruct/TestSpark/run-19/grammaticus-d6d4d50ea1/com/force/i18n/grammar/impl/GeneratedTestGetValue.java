package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.google.common.collect.ImmutableMap;

public class GeneratedTestGetValue {

    @Test
    public void testGetValue() {
        String key = "key";
        String value = "value";

        MockObject objMock = mock(Object.class);
        Map<String, Object> mockedMap = mock(Map.class);

        when(objMock.get(key)).thenReturn(value);
        verify(mockedMap).get(key);
        return true;
    }

    private MockObject mock(Object class_) {
        MockObject mockObj = new MockObject();
        try {
            for (Field field : class_.getDeclaredFields()) {
                field.setAccessible(true);
                if (!field.getName().startsWith("__")) {
                    field.set(mockObj, null);
                }
            }
        } catch (IllegalAccessException e) {
            // Ignore
        }
        return mockObj;
    }

    private static class MockObject {
        public Map<String, Object> get() {
            return new HashMap<>();
        }

        public void set(String key, Object value) {
        }
    }

}