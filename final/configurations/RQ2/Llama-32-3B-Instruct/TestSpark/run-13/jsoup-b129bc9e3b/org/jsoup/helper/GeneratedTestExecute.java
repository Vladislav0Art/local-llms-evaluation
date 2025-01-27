package org.jsoup.helper;

public class GeneratedTestExecute {

    private String key;
    private String value;

    public Response(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
}

public class Connection {
    private String content;

    public Connection() {
    }

    public Connection(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Connection)) return false;
        Connection connection = (Connection) o;
        return Objects.equals(content, connection.content);
    }
}

public class Document {

    private String key;
    private String value;

    public Document() {
    }

    public Document(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    private Connection httpConnection;

    @Before
    public void setup() {
        this.httpConnection = new Connection();
    }

    @Test
    public void testExecute() {
        // Given
        Response response = new Response("key", "value");

        when(httpConnection.getContent()).thenReturn("Mocked content");

        // When
        String actualContent = httpConnection.getContent();

        // Then
        assertEquals("Mocked content", actualContent);
    }

}