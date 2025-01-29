package com.force.i18n.grammar.impl;

public class GeneratedTestGetTermsToIncludeNull {

    private String[] emptyStringSet = new String[0];
    private Set<String>[] emptySet = new HashSet[0];

    @Test
    public void testGetTermsToIncludeNull() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;

        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

    private void set(HashMap<String, T> map) {
        emptyStringSet = map.keySet().toArray(new String[emptyStringSet.length]);
        emptySet = new HashSet<>(map.values());
    }

}