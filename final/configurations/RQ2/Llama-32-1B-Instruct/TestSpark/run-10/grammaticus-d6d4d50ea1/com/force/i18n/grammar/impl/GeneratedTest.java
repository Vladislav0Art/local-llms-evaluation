package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import com.force.i18n.HumanLanguage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

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

    @Test
    public void testGet() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Noun noun = obj1.get("noun");

        // Act
        String result = (String) noun.getName();

        // Assert
        System.out.println(result);  // noun
    }

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

    @Test
    public void testEntrySet() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, Noun>> entrySet = (Set<Map.Entry<String, Noun>>) obj1.entrySet();

        // Act
        Map<String, String> result1 = (Map<String, String>) entrySet.get("noun");

        // Assert
        System.out.println(result1 == null);  // false
    }

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

    @Test
    public void testPutAll() {
        // Arrange
        Object obj1 = new GrammaticalTermMapImpl<>();
        Noun noun = obj1.get("noun");

        // Act
        Set<Map.Entry<String, T>> entrySet = (Set<Map.Entry<String, T>>) obj1.entrySet();

        Map<String, String> map = ImmutableMap.of("noun", "value");
        entrySet.add(new AbstractMap.SimpleEntry<>("otherNoun", noun));
        obj1.putAll(ImmutableMap.copyOf(map));

        // Assert
        System.out.println((String) ((GrammaticalTermMap<T>) obj1).get("otherNoun"));  // value
    }

}