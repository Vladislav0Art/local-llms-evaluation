package org.jsoup.helper;

public class GeneratedTestGetSuccess {

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
    public void testGetSuccess() {
        HttpResponse response = (HttpResponse) this.request.getResponse();
        Assert.assertTrue("Request did not set response correctly", response.getSuccess());
    }

}