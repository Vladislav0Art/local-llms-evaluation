package com.sun.tools.xjc.addon.xew;

public class GeneratedTestNotElementInList {

    @Test
    public void testNotElementInList() {
        String[] values = {"value1", "value2"};
        assertFalse(java.util.Arrays.asList(values).contains("value3"));
    }
}

public class Main {

    private List<String> parametrisations;

    public Main(List<String> parametrisations) {
        this.parametrisations = parametrisations;
    }

    public void testRunElement() {
        Outline outline = new Outline(new ArrayList<>());
        // implement the logic to test if an element is in a list
    }
}

public class ListUtil {

    public static int findIndex(List<String> list, String target) {
        return list.indexOf(target);
    }
}

public class SetUtil {

    public static void addElement(Set<String> set, String element) {
        set.add(element);
    }

    public static boolean containsElement(Set<String> set, String element) {
        return set.contains(element);
    }
}

public class Outline {

    private List<String> parametrisations;

    public Outline(List<String> parametrisations) {
        this.parametrisations = parametrisations;
    }

}