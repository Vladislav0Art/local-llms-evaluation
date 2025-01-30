package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        when(renamingProvider.useRenamedNouns()).thenReturn(true);
        when(dictionary.getLanguage()).thenReturn(Mockito.mock(HumanLanguage.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder sb = new StringBuilder();
        termMap.writeJson(sb, renamingProvider, dictionary, Collections.singletonList("test"));
        assertEquals("{}", sb.toString());
    }

}