package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    private String charset;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return charset;
    }
}

public class DocumentBuilderTest {

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.setCharset("UTF-8");
        assertEquals("UTF-8", outputSettings.getCharset());
    }

}