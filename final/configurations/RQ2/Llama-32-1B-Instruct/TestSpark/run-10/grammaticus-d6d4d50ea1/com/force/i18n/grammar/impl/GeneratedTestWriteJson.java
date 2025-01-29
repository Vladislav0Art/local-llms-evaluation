package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTestWriteJson {

    private String NAME = "GrammaticalTermMapImpl";

    @Test
    public void testWriteJson() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        String json = "test";

        // Act
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.json"))) {
            oos.writeObject(obj1);
        }

        // Assert
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.json"))) {
            Object obj2 = (GrammaticalTermMap<T>) ois.readObject();

            System.out.println(obj2 == null);  // false
        }
    }

}