package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestValues {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testValues() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Set<T> values = (Set<T>) obj1.values();

        // Act
        Collection<String> result1 = (Collection<String>) values.iterator().next();

        // Assert
        System.out.println(result1);  // noun
    }

}