package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestHashCode {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testHashCode() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Object obj2 = new GrammaticalTermMapImpl<>();

        // Act
        int hash1 = (int) obj1.hashCode();
        int hash2 = (int) obj2.hashCode();

        // Assert
        System.out.println(hash1 == hash2);  // false
    }

}