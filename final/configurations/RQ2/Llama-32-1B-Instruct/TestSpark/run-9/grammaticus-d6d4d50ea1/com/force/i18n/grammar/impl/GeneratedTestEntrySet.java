package com.force.i18n.grammar.impl;

public class GeneratedTestEntrySet {

    @Test
    public void testEntrySet() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        HashSet<Map.Entry<String, T>> entrySet = map.entrySet();

        assert !entrySet.isEmpty : "entry set should be empty";
    }

}