package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testGet() {
        HumanLanguage language = new HumanLanguage();
        Set<T> expectedTerms = ImmutableMap.of("term1", "value1", "term2", "value2");
        Map<String, T> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, false);

        String actualName = "test-term";
        T actualTerm = instance.get(actualName);
        assert actualTerm == expectedTerms.get(actualName);

        String actualKeySet = instance.keySet();
        Assert.assertTrue(actualKeySet.contains(actualName));
    }

    @Test
    public void testPutAll() {
        HumanLanguage language = new HumanLanguage();
        Set<T> expectedTerms = ImmutableMap.of("term1", "value1", "term2", "value2");
        Map<String, T> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, false);

        GrammaticalTerm termToPut = new GrammaticalTerm();
        instance.putAll(mock(GrammaticalTermMap.class));

        // Mocking the put method
        when(instance.put("term3", termToPut)).thenReturn(true);

        String actualName = "test-term";
        T actualTerm = instance.get(actualName);
        assert actualTerm == expectedTerms.get(actualName);
        assert actualTerm != null;
    }

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        // Mocking the isSkinny method
        when(instance.isSkinny()).thenReturn(true);

        assert instance.isSkinny();
    }

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<GrammaticalTerm> instance2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        // Mocking the equals method
        when(instance1.equals(instance2)).thenReturn(true);

        assert instance1.equals(instance2);
    }

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        // Mocking the containsKey method
        when(instance.containsKey("test-term")).thenReturn(true);

        assert instance.containsKey("test-term");
    }

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        // Mocking the keySet method
        when(instance.keySet()).thenReturn(ImmutableMap.of("test-term1", "value1"));

        assert instance.keySet().contains("test-term1");
    }

}