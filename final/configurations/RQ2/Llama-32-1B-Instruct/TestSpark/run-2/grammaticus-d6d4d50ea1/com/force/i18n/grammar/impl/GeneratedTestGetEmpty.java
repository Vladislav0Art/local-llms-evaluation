package com.force.i18n.grammar.impl;

public class GeneratedTestGetEmpty {

    private String[] emptyStringSet = new String[0];
    private Set<String>[] emptySet = new HashSet[0];

    @Test
    public void testGetEmpty() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term = null;
        try {
            term = map.get("term");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

}