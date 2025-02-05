package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, String> termMap = new HashMap<>();
        termMap.put("Test", "Value");
        GrammaticalTermMapImpl<String> termMapImpl = new GrammaticalTermMapImpl<>(termMap, false);

        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        termMapImpl.writeJson(out, renamingProvider, dictionary, termMap.keySet());

        String expectedJson = ""; // The expected json output based on the termMapImpl content
        assertEquals(expectedJson, out.toString());
    }

}