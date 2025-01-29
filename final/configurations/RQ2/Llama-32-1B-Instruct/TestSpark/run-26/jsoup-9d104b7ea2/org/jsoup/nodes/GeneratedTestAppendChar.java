package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendChar {

    public static class MockAppendable implements Appendable {
        @Override
        public String append(char c) {
            return "";
        }
    }

    public static class MockDocument {
        private Document.OutputSettings out;

        public Document.OutputSettings getOutputSettings() {
            return out;
        }

        public void setOutputSettings(Document.OutputSettings outputSettings) {
            out = outputSettings;
        }

        public String toString() {
            return "";
        }
    }

    @Test
    public void testAppendChar() {
        Appendable app = mock(Appendable.class);
        Document document = new Document();
        document.setOutputSettings(new MockDocument());
        document.append('H');
        assertEquals(1, app.append('H').length());

        document.append('e');
        assertEquals(2, app.append('e').length());

        document.append('l');
        assertEquals(3, app.append('l').length());

        document.append('l');
        assertEquals(4, app.append('l').length());

        document.append('o');
        assertEquals(5, app.append('o').length());

        document.append(' ');
        assertEquals(6, app.append(' ').length());

        document.append('W');
        assertEquals(7, app.append('W').length());

        document.append('r');
        assertEquals(8, app.append('r').length());

        document.append('o');
        assertEquals(9, app.append('r').length());

        document.append('d');
        assertEquals(10, app.append('d').length());
    }

}