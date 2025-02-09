package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        StringBuilder out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);

        grammaticalTermMap.writeJson(out, renamingProvider, dictionary, null);

        Assert.assertTrue(out.length() > 0);
    }

}