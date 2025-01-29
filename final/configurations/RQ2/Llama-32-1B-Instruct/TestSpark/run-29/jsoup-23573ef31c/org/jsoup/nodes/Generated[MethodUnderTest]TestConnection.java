package org.jsoup.nodes;

public class Generated[MethodUnderTest]

TestConnection {

    @Test
    public void [MethodUnderTest]TestConnection() {
        Connection connection = Connection.get().open("http://example.com", new String[]{"Accept-Language: en-US"});
        Document document = Document.createDocument(connection);
        assertNotNull(document);
        assertTrue(document.connection() == connection);
    }

}