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

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Vehicle> map1 = new GrammaticalTermMapImpl<>();
        map1.put("Car", new Vehicle("Car"));
        GrammaticalTermMapImpl<Vehicle> map2 = new GrammaticalTermMapImpl<>();
        map2.putAll(map1);
        Assert.assertEquals("Car", map2.get("Car").getName());
    }

}