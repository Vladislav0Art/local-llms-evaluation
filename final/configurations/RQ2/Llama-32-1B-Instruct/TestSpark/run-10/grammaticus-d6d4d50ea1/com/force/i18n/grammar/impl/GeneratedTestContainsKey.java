package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestContainsKey {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testContainsKey() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Noun noun = obj1.get("noun");

        // Act
        boolean result = (boolean) noun.containsKey("noun");

        // Assert
        System.out.println(result);  // true
    }

}