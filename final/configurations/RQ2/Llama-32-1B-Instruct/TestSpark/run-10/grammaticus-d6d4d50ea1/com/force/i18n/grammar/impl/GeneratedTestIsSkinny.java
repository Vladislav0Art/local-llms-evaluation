package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestIsSkinny {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testIsSkinny() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Object obj2 = new GrammaticalTermMapImpl(true);

        // Act
        boolean result1 = (boolean) obj1.isSkinny();
        boolean result2 = (boolean) obj2.isSkinny();

        // Assert
        System.out.println(result1);  // false
    }

}