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

public class GeneratedHashSameMapsTest {

    @Test
    public void hashSameMapsTest() {
        Map<String, Vehicle> entries = new HashMap<>();
        entries.put("Car", new Vehicle("Car"));
        GrammaticalTermMapImpl<Vehicle> map1 = new GrammaticalTermMapImpl<>(entries, false);
        GrammaticalTermMapImpl<Vehicle> map2 = new GrammaticalTermMapImpl<>(entries, false);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
    }

}