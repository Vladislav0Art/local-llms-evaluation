package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamConverter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedWriteJson_withTerms_test {

    @Test
    public void writeJson_withTerms_test() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>();
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        map.writeJson(out, renamingProvider, dictionary, termsToInclude);
        assertTrue(out.toString().contains("{\"term1\":true}"));
    }

}