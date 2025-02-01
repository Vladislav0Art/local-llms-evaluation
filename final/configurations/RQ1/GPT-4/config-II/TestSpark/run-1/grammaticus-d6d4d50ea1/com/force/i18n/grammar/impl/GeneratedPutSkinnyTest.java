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

public class GeneratedPutSkinnyTest {

    @Test
    public void putSkinnyTest() {
        GrammaticalTermMapImpl<Noun> nounMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Noun noun = mock(Noun.class);

        nounMap.put("testNoun", noun);
    }

}