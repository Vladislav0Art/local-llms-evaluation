package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.google.common.collect.ImmutableMap;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        String key = "key";
        String value = "value";

        MockObject objMock = mock(Object.class);
        Map<String, Object> mockedMap = mock(Map.class);

        when(objMock.containsKey(key)).thenReturn(true);
        map.put(key, value);
        verify(mockedMap).containsValue(value);
        return true;
    }

}