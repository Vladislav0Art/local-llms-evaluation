package org.jsoup.helper;

public class GeneratedMethod_SetMethod {

    @Test
    public void method_SetMethod() {
        Method method = Method.GET;
        Connection connection = HttpConnection.method(method);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}