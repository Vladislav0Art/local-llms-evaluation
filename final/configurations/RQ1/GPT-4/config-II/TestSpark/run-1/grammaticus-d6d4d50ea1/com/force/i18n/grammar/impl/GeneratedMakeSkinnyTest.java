package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> nounMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> skinnyMap = (GrammaticalTermMapImpl<Noun>) (nounMap.makeSkinny());

        assertTrue(skinnyMap.isSkinny());
    }

}