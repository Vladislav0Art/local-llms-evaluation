package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWriteJsonTest {

    @Mock
    private RenamingProvider renamingProvider;

    @Mock
    private LanguageDictionary dictionary;

    @Mock
    private GrammaticalTerm grammaticalTerm;

    @Mock
    private HumanLanguage humanLanguage;

    @Mock
    private Noun noun;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void writeJsonTest() throws IOException {
        StringBuilder writer = new StringBuilder();
        when(grammaticalTerm.getName()).thenReturn("term");
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        termMap.writeJson(writer, renamingProvider, dictionary, null);
        Assert.assertTrue(writer.toString().startsWith("{"));
        Assert.assertTrue(writer.toString().endsWith("}"));
    }

}