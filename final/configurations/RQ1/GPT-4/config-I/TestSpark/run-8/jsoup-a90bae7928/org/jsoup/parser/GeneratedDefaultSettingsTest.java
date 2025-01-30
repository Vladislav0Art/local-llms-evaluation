package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDefaultSettingsTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();

        Class<?> innerClass = ParseSettings.class;

        final Field[] fields = innerClass.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getName().equalsIgnoreCase("preserveCase")) {
                        assertEquals(parseSettings, field.get(null));
                    }
                } catch (IllegalAccessException e) {
                    fail(e.getMessage());
                }
            }
        }
    }

}