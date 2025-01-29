package org.jsoup.helper;

public class GeneratedTestPostFailure {

    private boolean success;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }
}

class HttpRequestHandlerTest {

    private HttpRequest request;

    @Before
    public void setUp() {
        this.request = new HttpRequest();
    }

    @Test
    public void testPostFailure() {
        HttpResponse response = (HttpResponse) this.request.getResponse();
        Assert.assertFalse("Request did not respond successfully correctly", response.getSuccess());
    }

}