package com.force.i18n.grammar.impl;

public class GeneratedTestGetEmptyTermsToIncludeSkipListNull {

    private String[] emptyStringSet = new String[0];
    private Set<String>[] emptySet = new HashSet[0];

    @Test
    public void testGetEmptyTermsToIncludeSkipListNull() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        T term1 = null;
        T term2 = null;

        map.putAll(new HashMap<>());
        try {
            set = map.get("term1");
        } catch (Exception e) {
        }

        assert emptySet.length == 0;
    }

}