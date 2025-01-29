package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJsonMethod {

    @Test
    public void testWriteJsonMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(map);
        }

        InputStream is = bos.toByteArray();

        assertEquals(map, GrammaticalTermMapImplTest.class.isAssignableFrom(map.getClass()) ? (T[]) is : null);
    }

}