package org.jsoup.helper;

public class GeneratedTest {

    private String key;
    private String value;

    public Response() {
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
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

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
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
    public void connectUrlConnects() throws IOException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        Assert.assertNotNull(connection);
    }

}