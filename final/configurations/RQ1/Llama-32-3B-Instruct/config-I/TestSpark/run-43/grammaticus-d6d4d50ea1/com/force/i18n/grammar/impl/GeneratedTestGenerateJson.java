package com.force.i18n.grammar.impl;

public class GeneratedTestGenerateJson {

    @Test
    public void testGenerateJson() {
        Main main = new Main();
        java.util.Map<String, String> map = main.generateJsonMap();
        assertTrue(map.containsKey("test"));
        assertFalse(map.isEmpty());
    }

}