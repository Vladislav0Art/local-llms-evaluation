package org.jsoup.nodes;

public class Generated[MethodUnderTest]

TestCharset {

    @Test
    public void [MethodUnderTest]TestCharset() {
        Document document = Document.createShell(BASE_URI);
        assertEquals("UTF-8", document.charset());
    }

    private static class Document {
        private final Connection connection;

        public Document(String baseUri) throws Exception {
            this.connection = Connection.get().open(baseUri, new String[]{"Accept-Language: en-US"});
        }
    }

}