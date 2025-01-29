package org.jsoup.nodes;

public class GeneratedTestGetKeyValues {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetKeyValues() {
        Attributes attributes = new Attributes();
        add(attributes);
        List<Map<String, Object>> expectedValues = Collections.singletonList(Collections.singletonMap("testValue", "testValue"));
        assertEquals(expectedValues.get(0), getKeyValues());
    }

}