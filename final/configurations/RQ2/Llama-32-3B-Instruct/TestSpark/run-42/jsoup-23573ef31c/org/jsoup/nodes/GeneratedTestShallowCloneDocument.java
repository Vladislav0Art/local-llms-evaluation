package org.jsoup.nodes;

public class GeneratedTestShallowCloneDocument {

    private String value;

    public Document(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Document{" +
                "value='" + value + '\'' +
                '}';
    }
}

public class QuirksMode {
    private int mode;

    public QuirksMode(int mode) {
        this.mode = mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "QuirksMode{" +
                "mode=" + mode +
                '}';
    }
}

public class Parser {
    private int result;

    public Parser(int result) {
        this.result = result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Parser{" +
                "result=" + result +
                '}';
    }
}

public class OutputSettings {
    private boolean shallowClone;

    public OutputSettings(boolean shallowClone) {
        this.shallowClone = shallowClone;
    }

    public void setShallowClone(boolean shallowClone) {
        this.shallowClone = shallowClone;
    }

    @Override
    public String toString() {
        return "OutputSettings{" +
                "shallowClone=" + shallowClone +
                '}';
    }
}

public class GeneratedTest {

    public static Document cloneDocument(Document document) {
        return new Document(document.getValue());
    }

    public static void assertTrue(boolean flag, OutputSettings outputSettings) {
        if (!flag) {
            throw new AssertionError(outputSettings.toString());
        }
    }

    public static Document shallowCloneDocument(Document document) {
        return new Document("shallow Clone");
    }

    @Test
    public void testShallowCloneDocument() {
        Document document = new Document("Original Value");
        OutputSettings outputSettings = new OutputSettings(false);
        assertTrue(false, outputSettings);
        Document shallowClone = shallowCloneDocument(document);
        assertEquals("shallow Clone", shallowClone.getValue());
    }

}