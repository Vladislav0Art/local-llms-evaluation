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
public class GeneratedContainsKeyTest {

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
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(termMap.containsKey("term"));
        Assert.assertFalse(termMap.containsKey("invalid_term"));
    }

}