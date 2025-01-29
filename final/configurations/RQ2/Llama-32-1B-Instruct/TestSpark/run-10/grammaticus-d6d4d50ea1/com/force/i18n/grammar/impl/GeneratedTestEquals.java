package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestEquals {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testEquals() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Object obj2 = new GrammaticalTermMapImpl<>();

        // Act
        boolean result1 = (boolean) obj1.equals(obj2);
        boolean result2 = (boolean) obj2.equals(obj1);

        // Assert
        System.out.println(result1);  // true
    }

}