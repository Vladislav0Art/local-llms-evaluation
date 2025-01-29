package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() throws IOException {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        // Additional tests for keySet(), get(String), containsKey(String), entrySet(), values()
    }

}