package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testWriteJson() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.json"))) {
            oos.writeObject(map);
        } catch (IOException e) {
            fail("Error writing to file");
        }
    }

}