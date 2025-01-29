package com.force.i18n.grammar.impl;

public class GeneratedTestKeySetNotAccessible {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testKeySetNotAccessible() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.json"))) {
            Map<String, T> mapFromJSON = (Map<String, T>) ois.readObject();
            assertEquals(map, mapFromJSON);
        } catch (IOException | ClassNotFoundException e) {
            fail("Error reading from file");
        }
    }

}