package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.google.common.collect.ImmutableMap;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        String key = "key";
        String value = "value";

        MockObject objMock = mock(Object.class);
        Map<String, Object> mockedMap = mock(Map.class);

        when(objMock.writeJson(any(Appendable.class), any(RenamingProvider.class), any(LanguageDictionary.class), any(Collection.class))).thenReturn(ImmutableMap.of(key, value));
        map.writeJson(new StringBuilder(), new RenamingProvider(), new LanguageDictionary(), java.util.Collections.emptyList());
        return true;
    }

}