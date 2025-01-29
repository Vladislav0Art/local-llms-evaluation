package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testPutAll() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        Map<String, T> otherMap = Map.of("other", "otherWord");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.json"))) {
            oos.writeObject(map);
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.json"))) {
                map.putAll(otherMap);
            } catch (IOException e) {
                fail("Error putting to file");
            }
        } catch (IOException | ClassNotFoundException e) {
            fail("Error reading from file");
        }
    }

}