package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_GrammaticalTermValues {

    @Test
    public void testWriteJson_GrammaticalTermValues() {
        Set<T> values = new HashSet<>();
        values.add(new GrammaticalTerm());

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), values);

        assertEquals("{}", jsonContent);
    }

}