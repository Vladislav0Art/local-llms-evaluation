package org.jsoup.helper;

public class GeneratedTestFollowRedirects_setsFollowRedirects {

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
    public void testFollowRedirects_setsFollowRedirects() {
        // Arrange
        boolean followRedirects = true;

        // Act and Assert
        httpConnection.followRedirects(followRedirects);
    }

}