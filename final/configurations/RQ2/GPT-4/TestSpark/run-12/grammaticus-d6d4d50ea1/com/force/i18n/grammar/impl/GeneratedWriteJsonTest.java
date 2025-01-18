package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedWriteJsonTest {

    // Mock GrammaticalTerm
    GrammaticalTerm term1 = mock(GrammaticalTerm.class);
    GrammaticalTerm term2 = mock(GrammaticalTerm.class);

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        StringBuilder sb = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        mapImpl.writeJson(sb, renamingProvider, dictionary, Arrays.asList("term1"));
        assertNotNull(sb.toString());
    }

}