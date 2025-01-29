package com.force.i18n.grammar.impl;

import org.junit.Test;

public class GeneratedHasKey {

    private Map<String, Object> map = new HashMap<>();

    @Test
    public void hasKey() {
        Map<String, Object> mockMap = new MockObject();
        assertTrue(mockMap.containsKey("key"));
    }

}