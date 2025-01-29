package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestPut {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testPut() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Map<String, T> map = (Map<String, T>) obj1;

        // Act
        map.put("noun", "value");

        // Assert
        System.out.println((String) ((GrammaticalTermMap<T>) obj1).get("noun"));  // value
    }

}