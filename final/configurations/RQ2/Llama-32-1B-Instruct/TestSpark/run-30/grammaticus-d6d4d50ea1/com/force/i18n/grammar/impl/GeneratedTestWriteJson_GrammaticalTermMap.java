package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_GrammaticalTermMap {

    @Test
    public void testWriteJson_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), Collections.emptyList());

        assertEquals("{}", jsonContent);
    }

}