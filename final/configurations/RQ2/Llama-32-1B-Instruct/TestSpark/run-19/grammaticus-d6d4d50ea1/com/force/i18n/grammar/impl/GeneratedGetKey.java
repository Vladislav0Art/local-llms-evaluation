package com.force.i18n.grammar.impl;

import org.junit.Test;

public class GeneratedGetKey {

    private Map<String, Object> map = new HashMap<>();

    @Test
    public void getKey() {
        Map<String, Object> mockMap = new MockObject();
        mockMap.put("key", "value");
        assertNotNull(mockMap.keySet());
    }

}