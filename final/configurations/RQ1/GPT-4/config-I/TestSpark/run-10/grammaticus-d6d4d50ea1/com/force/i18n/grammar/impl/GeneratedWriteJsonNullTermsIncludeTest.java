package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedWriteJsonNullTermsIncludeTest {

    @Test
    public void writeJsonNullTermsIncludeTest() throws IOException {
        HashSet<String> set = new HashSet<>();
        StringBuilder out = new StringBuilder();
        RenamingProvider renamingProvider = null;
        LanguageDictionary dictionary = null;
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        gramTermMap.writeJson(out, renamingProvider, dictionary, null);
        Assert.assertEquals("{}", out.toString());
    }

}