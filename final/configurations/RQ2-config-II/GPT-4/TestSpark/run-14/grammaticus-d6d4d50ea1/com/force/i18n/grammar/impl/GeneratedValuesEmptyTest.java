package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedValuesEmptyTest {

    @Test
    public void valuesEmptyTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.values().isEmpty());
    }

}