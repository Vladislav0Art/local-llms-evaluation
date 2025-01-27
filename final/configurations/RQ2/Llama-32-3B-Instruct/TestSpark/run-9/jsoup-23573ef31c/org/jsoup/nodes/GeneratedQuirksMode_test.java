package org.jsoup.nodes;

public class GeneratedQuirksMode_test {

    @Test
    public void quirksMode_test() {
        QuirksMode quirksMode = mock(QuirksMode.class);
        when(quirksMode.getMode()).thenReturn("quirks");
        Document document = new Document("http://example.com");
        Document document2 = document.quirksMode(quirksMode);
        assertNotNull(document2);
        assertEquals(quirksMode.getMode(), document2.quirksMode());
    }

}