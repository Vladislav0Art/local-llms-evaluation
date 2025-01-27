package com.force.i18n.grammar.impl;

public class GeneratedTestGetTerms {

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
    public void testGetTerms() {
        Map<String, String> termsMap = new HashMap<>("term1", "value1");
        List<String> expectedTerms = new ArrayList<>("term1");
        assertEquals(1, expectedTerms.getElementCount());
        assertEquals("term1", expectedTerms.getElement(0));
    }

}