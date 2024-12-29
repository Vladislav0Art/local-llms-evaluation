package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedWriteJsonNullTest {

    @Test
    public void writeJsonNullTest() throws IOException {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();

        Appendable out = Mockito.mock(Appendable.class);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Mockito.mock(Collection.class);

        try {
            obj.writeJson(out, renamingProvider, dictionary, termsToInclude);
        } catch (IOException e) {
            fail("IOException expected");
        }
    }

}