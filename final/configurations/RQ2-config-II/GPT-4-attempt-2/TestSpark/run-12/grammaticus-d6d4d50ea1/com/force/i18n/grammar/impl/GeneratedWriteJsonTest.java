package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.*;

import org.junit.Test;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new ArrayList<>();

        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>();
        termMapImpl.writeJson(out, renamingProvider, dictionary, termsToInclude);
    }

}