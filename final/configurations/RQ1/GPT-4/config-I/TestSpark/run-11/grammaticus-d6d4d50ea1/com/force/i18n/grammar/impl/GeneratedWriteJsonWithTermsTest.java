package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class GeneratedWriteJsonWithTermsTest {

    @Test
    public void writeJsonWithTermsTest() throws IOException {
        StringWriter writer = new StringWriter();
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>();
        termsToInclude.add("term");

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(writer, provider, dictionary, termsToInclude);

        Assert.assertEquals("{}", writer.toString());
    }

}