package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedWriteJson {

    @Test
    public void writeJson() throws IOException {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Mockito.mock(Collection.class);

        MapSerializer serializer = new MapSerializer();
        StringBuilder jsonBuilder = new StringBuilder();

        map.writeJson(jsonBuilder, renamingProvider, dictionary, termsToInclude);

        assertNotNull(serializer.serialize(map));
    }

}