package org.jsoup.helper;

public class GeneratedTestTimeout_setsTimeout {

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
    public void testTimeout_setsTimeout() {
        // Arrange
        int millis = 1000;

        // Act and Assert
        httpConnection.timeout(millis);
    }

}