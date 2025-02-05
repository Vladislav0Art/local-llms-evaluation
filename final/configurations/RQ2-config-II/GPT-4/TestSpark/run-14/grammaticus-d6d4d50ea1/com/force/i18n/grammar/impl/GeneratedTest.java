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

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<Vehicle> map1 = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(map1, map1);
    }

    @Test
    public void hashSameMapsTest() {
        Map<String, Vehicle> entries = new HashMap<>();
        entries.put("Car", new Vehicle("Car"));
        GrammaticalTermMapImpl<Vehicle> map1 = new GrammaticalTermMapImpl<>(entries, false);
        GrammaticalTermMapImpl<Vehicle> map2 = new GrammaticalTermMapImpl<>(entries, false);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Assert.assertTrue(map.isSkinny());
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        Assert.assertFalse(map.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        map.writeJson(out, renamingProvider, dictionary, new HashSet<>(Arrays.asList("Car", "Bus")));
        Assert.assertNotEquals("", out.toString());
    }

    @Test
    public void keySetEmptyTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.keySet().isEmpty());
    }

    @Test
    public void getNullTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertNull(map.get("Car"));
    }

    @Test
    public void containsKeyFalseTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(map.containsKey("Car"));
    }

    @Test
    public void entrySetEmptyTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.entrySet().isEmpty());
    }

    @Test
    public void valuesEmptyTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.values().isEmpty());
    }

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        map.put("Car", new Vehicle("Car"));
        Assert.assertEquals("Car", map.get("Car").getName());
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Vehicle> map1 = new GrammaticalTermMapImpl<>();
        map1.put("Car", new Vehicle("Car"));
        GrammaticalTermMapImpl<Vehicle> map2 = new GrammaticalTermMapImpl<>();
        map2.putAll(map1);
        Assert.assertEquals("Car", map2.get("Car").getName());
    }

    @Test
    public void isEmptyTrueTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        map.put("Car", new Vehicle("Car"));
        Assert.assertFalse(map.isEmpty());
    }

    class Vehicle extends GrammaticalTerm {
        private String name;

        public Vehicle(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

}