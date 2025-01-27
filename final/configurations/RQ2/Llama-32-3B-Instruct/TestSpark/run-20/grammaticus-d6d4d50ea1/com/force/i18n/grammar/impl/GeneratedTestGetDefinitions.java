package com.force.i18n.grammar.impl;

public class GeneratedTestGetDefinitions {

    private String key;
    private String value;

    public Map(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class List {
    private String element;

    public List(String element) {
        this.element = element;
    }

    public int getElementCount() {
        return 1;
    }

    public String getElement(int index) {
        if (index == 0) {
            return element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}

public class HashMap extends Map {
}

public class ArrayList extends List {
}

public class Test {

    @Test
    public void testGetDefinitions() {
        Map<String, String> termsMap = new HashMap<>("term2", "value2");
        List<String> expectedDefinitions = new ArrayList<>("value2");
        assertEquals(1, expectedDefinitions.getElementCount());
        assertEquals("value2", expectedDefinitions.getElement(0));
    }
}

public class Grammar {

    public List<String> getExpectedTerms(Map<String, String> termsMap) {
        return new ArrayList<>(termsMap.keySet());
    }

    public List<String> getExpectedDefinitions(Map<String, String> termsMap) {
        return new ArrayList<>(termsMap.values());
    }

}