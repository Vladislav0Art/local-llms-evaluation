package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testGetMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals("string", map.get("test"));
    }

    @Test
    public void testGetByNonExistentKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals(null, map.get("nonExistentKey"));
    }

    @Test
    public void testEqualsMethod() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertEquals(map1, map2);

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map1.equals(obj);
            fail("Equals method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testHashCodeMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals(0, map.hashCode());

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map.hashCode();
            fail("HashCode method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIsSkinnyMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertTrue(map.isSkinny());
    }

    @Test
    public void testMakeSkinnyMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        GrammaticalTermMap<T> skinnyMap = new GrammaticalTermMapImpl<>(map, true);

        assertEquals(map, skinnyMap);
    }

    @Test
    public void testWriteJsonMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        String json = map.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), Arrays.asList("term1", "term2"));

        String[] expectedLines = {"{ \"terms\": [ \"term1\" , \"term2\" ] }", "{ \"key\": \"term1\", \"value\": \"term1\" }", "{ \"key\": \"term2\", \"value\": \"term2\" }"};

        int index = 0;
        for (String line : json.split("\n")) {
            if (line.startsWith("{")) {
                index++;
            }
            System.out.println(line);
            if (index == expectedLines.length) {
                break;
            }
        }

        // check that there are no extra lines
        if (expectedLines.length != 2) {
            fail("Unexpected number of lines in JSON output");
        }
    }

    @Test
    public void testPutMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        map.put("test", "value");

        assertEquals(1, map.size());
    }

    @Test
    public void testPutAllMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        map.putAll(new GrammaticalTermMap<String, String>() {
            @Override
            public void put(String k, T v) {
                // do nothing
            }

            @Override
            public Set<Map.Entry<String, T>> entrySet() {
                return Collections.emptySet();
            }
        });

        assertEquals(1, map.size());
    }

    @Test
    public void testIsEmptyMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertTrue(map.isEmpty());

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map.isEmpty();
            fail("Empty method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}