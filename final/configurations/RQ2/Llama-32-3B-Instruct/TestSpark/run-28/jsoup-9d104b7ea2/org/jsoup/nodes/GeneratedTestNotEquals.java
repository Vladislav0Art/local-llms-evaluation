package org.jsoup.nodes;

public class GeneratedTestNotEquals {

    private Document document;

    @Before
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testNotEquals() {
        Document.OutputSettings settings1 = new Document.OutputSettings();
        Document.OutputSettings settings2 = new Document.OutputSettings();

        assertFalse(document.equals(settings1));
        assertTrue(!document.equals(settings1));
        assertFalse(document.equals(new Object()));
    }

}