package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    public static class Document {
        public interface OutputSettings {
            String outerHtmlHead(Appendable accum, int depth, OutputSettings out);

            String outerHtmlTail(Appendable accum, int depth, OutputSettings out);
        }
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        Appendable mockAppendable = new Object() {
            @Override
            public Appendable append(char c) {
                return this;
            }
        };
        Document.OutputSettings mockOutputSettings = mock(Document.OutputSettings.class);
        when(mockOutputSettings.outerHtmlTail(mockAppendable, 0, mockOutputSettings)).thenThrow(IllegalStateException.class);
        assertEquals("Hello World", testOuterHtmlHead(mockOutputSettings));
    }

}