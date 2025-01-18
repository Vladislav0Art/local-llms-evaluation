package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws Exception {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        map.put("Test", noun);
        StringBuilder out = new StringBuilder();
        map.writeJson(out, renamingProvider, languageDictionary, Collections.singletonList("Test"));
        assertNotEquals("Output string should not be empty", "", out.toString());
    }

}