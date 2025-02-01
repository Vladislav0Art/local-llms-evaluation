package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = mock(Noun.class);
        when(noun.getName()).thenReturn("testNoun");
        map.put("testNoun", noun);

        GrammaticalTermMapImpl<Noun> nounMap = new GrammaticalTermMapImpl<>(map, false);
        Appendable out = new StringBuilder();
        RenamingProvider provider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        when(dictionary.getLanguage()).thenReturn(mock(HumanLanguage.class));

        nounMap.writeJson(out, provider, dictionary, Arrays.asList("testNoun"));
        assertEquals("{\"testnoun\":null}", out.toString());
    }

}