package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.google.common.collect.ImmutableMap;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        String key = "key";
        String value = "value";

        MockObject objMock = mock(Object.class);
        Map<String, Object> mockedMap = mock(Map.class);

        when(objMock.get(key)).thenReturn(value);
        verify(mockedMap).get(key);
        return true;
    }

}