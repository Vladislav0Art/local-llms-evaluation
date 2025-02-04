package org.jsoup.nodes;

public class GeneratedTestQuirksMode {

    private String content;

    public DocumentGenerator(String content) {
        this.content = content;
    }

    public static class OutputSettings {
        public boolean prettyPrint;
        public int indentAmount;
        public int maxPaddingWidth;

        public OutputSettings(boolean prettyPrint, int indentAmount, int maxPaddingWidth) {
            this.prettyPrint = prettyPrint;
            this.indentAmount = indentAmount;
            this.maxPaddingWidth = maxPaddingWidth;
        }
    }

    public static class QuirksMode {
        public static final String NO
        QUIRKS ="noQuirks";
        public static final String QUIRKS = "quirks";
        public static final String LIMITED
        QUIRKS ="limitedQuirks";
    }

    public Document outputSettings(OutputSettings outputSettings) {
        return this;
    }

    public OutputSettings outputSettings() {
        return new OutputSettings(true, 4, 30);
    }
}

public class ParserGenerator {

    private String content;

    public ParserGenerator(String content) {
        this.content = content;
    }

    public static class QuirksMode {
        public static final String NO
        QUIRKS ="noQuirks";
        public static final String QUIRKS = "quirks";
        public static final String LIMITED
        QUIRKS ="limitedQuirks";
    }

    public Document quirksMode(QuirksMode quirksMode) {
        return this;
    }

    public QuirksMode quirksMode() {
        return QuirksMode.LIMITED QUIRKS;
    }
}

public class ConnectionGenerator {

    private String content;

    public ConnectionGenerator(String content) {
        this.content = content;
    }

    public static class ConnectionType {
    }

    public Document connection(ConnectionGenerator.ConnectionType connectionType) {
        return this;
    }

    public Document connection() {
        return this;
    }
}

public class ParserGeneratorTest {

    @Test
    public void testQuirksMode() {
        String content = "test";
        DocumentGenerator documentGenerator = new DocumentGenerator(content);
        QuirksMode quirksMode = documentGenerator.quirksMode().quirksMode();
        Assert.assertEquals(QuirksMode.LIMITED QUIRKS, quirksMode);
    }

}