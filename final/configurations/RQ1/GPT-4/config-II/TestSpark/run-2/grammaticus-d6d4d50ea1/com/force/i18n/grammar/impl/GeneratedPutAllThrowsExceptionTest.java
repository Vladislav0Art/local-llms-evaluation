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
public class GeneratedPutAllThrowsExceptionTest {

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
    public void putAllThrowsExceptionTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("This map is not able to modify");
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        map1.put("term1", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map1, true);

        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("term2", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);

        termMap1.putAll(termMap2);
    }

}