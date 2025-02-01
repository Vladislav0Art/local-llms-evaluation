package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        HumanLanguage language = mock(HumanLanguage.class);

        when(dictionary.getLanguage()).thenReturn(language);
        when(renamingProvider.useRenamedNouns()).thenReturn(true);

        Noun noun = mock(Noun.class);
        when(noun.getName()).thenReturn("test");
        when(renamingProvider.getRenamedNoun(language, "test")).thenReturn(noun);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("key", noun);

        map.writeJson(out, renamingProvider, dictionary, Arrays.asList("key"));

        assertTrue(out.toString().trim().endsWith("}"));
    }

}