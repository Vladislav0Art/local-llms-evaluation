package org.jsoup.nodes;

public class GeneratedTestConnectionReturn {

    public Document document;
    public Parser parser = new Parser();
    public QuirksMode quirksMode;

    @Test
    public void testConnectionReturn() {
        Connection connection = new Connection();
        Document actualDocument = new Document();
        Mockito.when(connection.get()).thenReturn(actualDocument);
    }

}