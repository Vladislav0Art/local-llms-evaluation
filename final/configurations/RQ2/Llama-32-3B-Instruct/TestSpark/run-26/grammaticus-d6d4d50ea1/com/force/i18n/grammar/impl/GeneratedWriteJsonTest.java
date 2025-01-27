package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException, ClassNotFoundException {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.writeJson(Mockito.mock(Appendable.class), Mockito.mock(RenamingProvider.class), Mockito.mock(LanguageDictionary.class), Mockito.mock(Collection.class));
    }

}