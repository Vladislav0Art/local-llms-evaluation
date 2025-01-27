package org.jsoup.helper;

public class GeneratedMethod SetsMethodOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void method

    SetsMethodOnConnection() {
        Method method = Method.GET;
        Connection connection = HttpConnection.method(method);
        assertEquals(method, connection.getMethod());
    }

}