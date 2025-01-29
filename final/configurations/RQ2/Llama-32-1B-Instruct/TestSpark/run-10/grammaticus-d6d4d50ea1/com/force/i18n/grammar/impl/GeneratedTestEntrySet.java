package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestEntrySet {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testEntrySet() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, Noun>> entrySet = (Set<Map.Entry<String, Noun>>) obj1.entrySet();

        // Act
        Map<String, String> result1 = (Map<String, String>) entrySet.get("noun");

        // Assert
        System.out.println(result1 == null);  // false
    }

}