package org.jsoup.nodes;

public class GeneratedTestAppend {

    private String text;

    public Node(String text) {
        this.text = text;
    }

    public Appendable splitText(int index) {
        StringBuilder sb = new StringBuilder(text);
        return sb.subSequence(0, index).append(", ");
    }
}

public class DocumentOutputSettings {
    private StringBuilder append;

    public DocumentOutputSettings() {
    }

    public void append(String text) {
        if (append == null) {
            append = new StringBuilder();
        }
        append.append(text);
    }

    public String getAppend() {
        return append.toString();
    }
}

public class DocumentTest {

    @Test
    public void testAppend() {
        StringBuilder accum = new StringBuilder();
        DocumentOutputSettings out = new DocumentOutputSettings();
        out.append("t");
        assertEquals("t", out.getAppend());
        out.append("");
        assertEquals("", out.getAppend());
    }

}