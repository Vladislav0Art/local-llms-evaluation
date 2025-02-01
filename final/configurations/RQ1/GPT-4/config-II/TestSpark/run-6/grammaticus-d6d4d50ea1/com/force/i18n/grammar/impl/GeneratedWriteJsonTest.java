package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Noun term = Mockito.mock(Noun.class);
        Mockito.when(term.getName()).thenReturn("Noun");
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Noun", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        termMap.writeJson(out, provider, dictionary, null);
        Assert.assertTrue(out.toString().contains("\"noun\":"));
    }

}