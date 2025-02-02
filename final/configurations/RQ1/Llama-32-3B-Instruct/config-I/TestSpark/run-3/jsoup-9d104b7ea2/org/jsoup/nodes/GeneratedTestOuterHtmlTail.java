package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    public static class Document {
        public interface OutputSettings {
            String outerHtmlHead(Appendable accum, int depth, OutputSettings out);

            String outerHtmlTail(Appendable accum, int depth, OutputSettings out);
        }
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        Appendable mockAppendable = new Object() {
            @Override
            public Appendable append(char c) {
                return this;
            }
        };
        Document.OutputSettings mockOutputSettings = mock(Document.OutputSettings.class);
        when(mockOutputSettings.outerHtmlHead(mockAppendable, 0, mockOutputSettings)).thenThrow(IllegalStateException.class);
        assertEquals("<p>Hello World</p>", testOuterHtmlTail(mockOutputSettings));
    }

    public static String testOuterHtmlHead(Document.OutputSettings out) {
        // implementation
    }

    public static String testOuterHtmlTail(Document.OutputSettings out) {
        // implementation
    }
}

public class Appendable implements java.io.Serializable, Appendable {
    @Override
    public Appendable append(char c) {
        return this;
    }
}

}