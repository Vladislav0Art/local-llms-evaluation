package org.jsoup.helper;

public class GeneratedPostData ReturnsCorrectInstanceWithPostData {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void postData

    ReturnsCorrectInstanceWithPostData() {
        String postdata = "{\"key\":\"value\"}";
        Connection connection = HttpConnection.postData(postdata);
        assertNotNull(connection);
        assertEquals(postdata, connection.getData().get("post_data"));
    }

}