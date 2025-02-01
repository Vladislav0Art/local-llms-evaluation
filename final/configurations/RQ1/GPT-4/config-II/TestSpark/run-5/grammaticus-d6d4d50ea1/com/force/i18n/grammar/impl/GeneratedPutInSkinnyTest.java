package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedPutInSkinnyTest {

    @Test
    public void putInSkinnyTest() {
        Map<String, LanguageTerm> testingMap = new HashMap<>();
        GrammaticalTermMapImpl<LanguageTerm> map = new GrammaticalTermMapImpl<>(testingMap, true);
        map.put("testKey", mock(LanguageTerm.class));
    }

}