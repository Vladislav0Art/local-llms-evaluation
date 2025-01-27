package org.jsoup.helper;

public class GeneratedTest {

    private Object response;

    public Response get() {
        return new Response();
    }

    public Response post() {
        Response response = mock(Response.class);
        this.response = response;
        response.setMethod("POST");
        return response;
    }

    public Response execute() {
        Response response = new ResponseMock("POST");
        this.response = response;
        return response;
    }
}

public class Response {
    private String method;

    public void setMethod(String method) {
        this.method = method;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Object))
            return false;
        Object other = (Object) obj;
        return Objects.equals(method, other);
    }
}

public class GeneratedTest {
    private Connection connection;

    @Before
    public void setUp() {
        connection = new Connection();
    }

}