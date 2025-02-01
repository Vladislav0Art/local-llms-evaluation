package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Map<String, LanguageTerm> testingMap = new HashMap<>();
        GrammaticalTermMapImpl map1 = new GrammaticalTermMapImpl<>(testingMap, true);
        GrammaticalTermMapImpl map2 = new GrammaticalTermMapImpl<>(testingMap, true);
        Assert.assertTrue(map1.equals(map2));
        Assert.assertFalse(map1.equals(new Object()));
        Assert.assertFalse(map1.equals(null));
    }

}