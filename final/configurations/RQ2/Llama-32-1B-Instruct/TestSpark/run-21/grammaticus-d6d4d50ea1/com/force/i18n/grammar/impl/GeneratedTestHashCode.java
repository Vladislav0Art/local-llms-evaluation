package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("term1", "value1");
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        map2.put("term1", "value1");
        int hashCode1 = map1.hashCode();
        int hashCode2 = map2.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

}