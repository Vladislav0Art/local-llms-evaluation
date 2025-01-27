package org.jsoup.nodes;

public class GeneratedTestEquals {

    private Document document;

    @Before
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testEquals() {
        Document.OutputSettings settings1 = new Document.OutputSettings();
        Document.OutputSettings settings2 = new Document.OutputSettings();

        assertTrue(document.equals(settings1));
        assertFalse(document.equals(new Object()));
    }

}