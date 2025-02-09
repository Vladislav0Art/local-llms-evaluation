package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder output = new StringBuilder();
        RenamingProvider renamingProvider = null;
        LanguageDictionary dictionary = null;
        termMap.writeJson(output, renamingProvider, dictionary, null);
        assertNotNull(output.toString());
    }

}