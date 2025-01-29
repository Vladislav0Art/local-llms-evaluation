package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        try {
            map.writeJson(baos, null, null, null);
        } finally {
            oos.close();
        }

        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        try {
            GrammaticalTermMap<String, String> loadedMap = (GrammaticalTermMap<String, String>) ois.readObject();

            assertTrue(loadedMap.isEmpty());
        } finally {
            ois.close();
        }
    }

}