package org.jsoup.helper;

public class GeneratedTestPostDataCharset_setsPostDataCharset {

    @Mock
    private SSLSocketFactory sslsSocketFactory;

    @Mock
    private CookieStore cookieStore;

    @Mock
    private Parser parser;

    public HttpConnection httpConnection = new HttpConnection();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPostDataCharset_setsPostDataCharset() {
        // Arrange
        String charset = "utf-8";

        // Act and Assert
        httpConnection.postDataCharset(charset);
    }

}