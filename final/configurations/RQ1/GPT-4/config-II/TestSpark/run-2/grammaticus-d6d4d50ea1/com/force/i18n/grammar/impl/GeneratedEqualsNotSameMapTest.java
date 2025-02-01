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
public class GeneratedEqualsNotSameMapTest {

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
    public void equalsNotSameMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap1.put("term1", grammaticalTerm);
        termMap2.put("term2", grammaticalTerm);
        Assert.assertFalse(termMap1.equals(termMap2));
    }

}