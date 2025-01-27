package org.jsoup.helper;

public class GeneratedTestPost {

    private Response response;

    public Response get() {
        return new Response();
    }

    public Response post() {
        response = new Response();
        response.setMethod("POST");
        return response;
    }

    public Response execute() {
        response = mock(Response.class);
        return response;
    }
}

public class Response {
    private String method;

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Response))
            return false;
        Response other = (Response) obj;
        return Objects.equals(method, other.method);
    }
}

public class GeneratedTest {
    private Connection connection;

    @Before
    public void setUp() {
        connection = new Connection();
    }

    @Test
    public void testPost() {
        assertNotNull(connection.post());
    }

}