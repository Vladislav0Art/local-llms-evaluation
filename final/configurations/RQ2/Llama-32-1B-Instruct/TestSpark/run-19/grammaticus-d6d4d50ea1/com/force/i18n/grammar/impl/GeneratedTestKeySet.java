package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.google.common.collect.ImmutableMap;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        String key = "key";
        String value = "value";

        MockObject objMock = mock(Object.class);
        Map<String, Object> mockedMap = mock(Map.class);

        when(objMock.keySet()).thenReturn(java.util.Arrays.asList(key));
        map.put(key, value);
        verify(mockedMap).getKeySet().contains(key);
        return true;
    }

}