package org.jsoup.helper;

public class GeneratedTestMaxBodySize_setsMaxBodySize {

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
    public void testMaxBodySize_setsMaxBodySize() {
        // Arrange
        int bytes = 1024 * 1024;

        // Act and Assert
        httpConnection.maxBodySize(bytes);
    }

}