package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTermTest {

    @Test
    public void writeJsonTermTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        RenamingProvider provider = mock(RenamingProvider.class);
        Noun term = mock(Noun.class);
        when(term.getName()).thenReturn("noun");
        StringBuilder out = new StringBuilder();
        map.writeJsonTerm(out, provider, term, mock(HumanLanguage.class));
        assertEquals("\"noun\":", out.toString());
    }

}