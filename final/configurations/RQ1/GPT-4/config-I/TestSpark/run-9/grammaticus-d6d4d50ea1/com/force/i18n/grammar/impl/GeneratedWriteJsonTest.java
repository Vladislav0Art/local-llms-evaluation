package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedWriteJsonTest {

    static Noun nounExample = Mockito.mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);
        StringBuilder output = new StringBuilder();
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Mockito.when(dictionary.getLanguage()).thenReturn(HumanLanguage.ENGLISH);
        mapImpl.writeJson(output, Mockito.mock(RenamingProvider.class), dictionary, null);
    }

}