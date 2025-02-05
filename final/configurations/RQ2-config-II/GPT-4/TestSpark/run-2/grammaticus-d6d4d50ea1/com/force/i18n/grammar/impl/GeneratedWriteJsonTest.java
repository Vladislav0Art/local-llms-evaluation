package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        StringBuilder sb = new StringBuilder();

        RenamingProvider rp = Mockito.mock(RenamingProvider.class);
        LanguageDictionary ld = Mockito.mock(LanguageDictionary.class);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.writeJson(sb, rp, ld, new ArrayList<>());

        assertEquals("{}", sb.toString());
    }

}