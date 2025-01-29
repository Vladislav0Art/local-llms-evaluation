package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestPutAll {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testPutAll() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Noun noun = obj1.get("noun");

        // Act
        Set<Map.Entry<String, T>> entrySet = (Set<Map.Entry<String, T>>) obj1.entrySet();

        Map<String, String> map = ImmutableMap.of("noun", "value");
        entrySet.add(new AbstractMap.SimpleEntry<>("otherNoun", noun));
        obj1.putAll(ImmutableMap.copyOf(map));

        // Assert
        System.out.println((String) ((GrammaticalTermMap<T>) obj1).get("otherNoun"));  // value
    }

}