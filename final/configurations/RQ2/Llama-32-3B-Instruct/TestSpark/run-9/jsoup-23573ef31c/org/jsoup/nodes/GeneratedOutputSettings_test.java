package org.jsoup.nodes;

public class GeneratedOutputSettings_test {

    @Test
    public void outputSettings_test() {
        OutputSettings outputSettings = mock(OutputSettings.class);
        when(outputSettings.getCharset()).thenReturn(Charset.forName("UTF-8"));
        Document document = new Document("http://example.com");
        Document document2 = document.outputSettings(outputSettings);
        assertNotNull(document2);
        assertEquals(outputSettings.getCharset(), document2.charset());
    }

}