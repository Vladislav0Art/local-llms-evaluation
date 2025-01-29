package org.jsoup.helper;

public class GeneratedTest_connect_proxy_with_non_existent_url {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_proxy_with_non_existent_url() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect(new URL("non_existent_url")).throws(new URISyntaxException())).
        thenReturn(null);
        HttpConnection connection = new HttpConnection();
        assertEquals(-1, connection.proxy(null).getUrl());
    }

}