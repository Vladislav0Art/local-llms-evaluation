package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestMakeSkinny {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testMakeSkinny() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Object obj2 = new GrammaticalTermMapImpl(true);

        // Act
        GrammaticalTermMap<T> result1 = (GrammaticalTermMap<T>) obj1.makeSkinny();
        GrammaticalTermMap<T> result2 = (GrammaticalTermMap<T>) obj2.makeSkinny();

        // Assert
        System.out.println(result1 == result2);  // false
    }

}