package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_GrammaticalTermSet {

    @Test
    public void testWriteJson_GrammaticalTermSet() {
        Set<Map.Entry<String, Object>> entries = new HashSet<>();
        entries.add(new AbstractMap.SimpleEntry<>("term1", new GrammaticalTerm()));
        entries.add(new AbstractMap.SimpleEntry<>("term2", new GrammaticalTerm()));

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), entries);

        assertEquals("{}", jsonContent);
    }

}