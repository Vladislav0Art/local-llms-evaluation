package org.jsoup.helper;

public class Generated[connect][ReturnsURLConnection]

Test {

    @Test
    public void [connect][ReturnsURLConnection]Test() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertTrue(connection instanceof URLConnection);
    }

}