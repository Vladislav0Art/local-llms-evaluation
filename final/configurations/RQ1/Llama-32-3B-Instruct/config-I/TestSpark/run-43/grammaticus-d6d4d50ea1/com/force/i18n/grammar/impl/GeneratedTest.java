package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testGenerateJson() {
        Main main = new Main();
        java.util.Map<String, String> map = main.generateJsonMap();
        assertTrue(map.containsKey("test"));
        assertFalse(map.isEmpty());
    }

    @Test
    public void testGenerateJsonAgain() {
        Main main = new Main();
        java.util.Map<String, String> map = main.generateJsonMap();
        assertTrue(map.containsKey("test"));
        assertFalse(map.isEmpty());
    }
}

public class Main {

    public static java.util.Map<String, String> generateJsonMap() {
        java.util.Map<String, String> map = new java.util.HashMap<>();
        map.put("test", "some value");
        return map;
    }

    public void doSomeWork() {
    }

}