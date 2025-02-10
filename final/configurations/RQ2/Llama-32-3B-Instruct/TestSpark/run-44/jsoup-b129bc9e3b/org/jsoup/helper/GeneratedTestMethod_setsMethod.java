package org.jsoup.helper;

public class GeneratedTestMethod_setsMethod {

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
    public void testMethod_setsMethod() {
        // Arrange
        Method method = Method.GET;

        // Act and Assert
        httpConnection.method(method);
    }

}