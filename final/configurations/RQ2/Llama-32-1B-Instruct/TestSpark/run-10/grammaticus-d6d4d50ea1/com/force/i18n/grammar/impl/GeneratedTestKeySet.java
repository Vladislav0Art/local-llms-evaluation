package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestKeySet {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testKeySet() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Object obj2 = new GrammaticalTermMapImpl<>();

        // Act
        Set<String> result1 = (Set<String>) obj1.getKeySet();
        Set<String> result2 = (Set<String>) obj2.getKeySet();

        // Assert
        System.out.println(result1 == result2);  // false
    }

}