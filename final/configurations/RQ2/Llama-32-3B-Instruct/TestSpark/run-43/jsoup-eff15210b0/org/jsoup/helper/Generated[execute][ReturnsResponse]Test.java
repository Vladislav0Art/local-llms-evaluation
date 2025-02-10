package org.jsoup.helper;

public class Generated[execute][ReturnsResponse]

Test {

    @Test
    public void [execute][ReturnsResponse]Test() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Response response = connection.execute();
        Assert.assertNotNull(response);
    }

}