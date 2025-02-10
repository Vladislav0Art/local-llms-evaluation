package org.jsoup.helper;

public class GeneratedTestData_setsData {

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
    public void testData_setsData() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act and Assert
        httpConnection.data(key, value);
    }

}