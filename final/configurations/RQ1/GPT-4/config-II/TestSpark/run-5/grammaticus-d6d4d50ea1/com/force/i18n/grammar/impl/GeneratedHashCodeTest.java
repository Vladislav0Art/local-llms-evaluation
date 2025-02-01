package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Map<String, LanguageTerm> testingMap = new HashMap<>();
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>(testingMap, false);
        int hashCode = map.hashCode();
        int expectedHashCode = testingMap.hashCode();
        Assert.assertEquals(expectedHashCode, hashCode);
    }

}