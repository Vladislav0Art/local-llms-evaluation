package org.jsoup.nodes;

public class GeneratedTestSizeStringNotNull {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        this.attributes = new Attributes();
    }

    @Test
    public void testSizeStringNotNull() {
        String key = "test";
        Object value = null;
        Object result = (int) attributes.size();
        assertEquals(0, result);
    }

}