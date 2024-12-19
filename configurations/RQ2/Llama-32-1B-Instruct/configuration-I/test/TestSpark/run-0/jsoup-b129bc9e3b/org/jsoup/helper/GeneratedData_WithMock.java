package org.jsoup.helper;

public class GeneratedData_WithMock {

    @FunctionalInterface
    private static interface MethodUnderTest {
        Connection newRequest();
    }

    @FunctionalInterface
    private static interface Proxy {
        Connection proxy(@Nullable String host, int port);
    }

    @FunctionalInterface
    private static interface UserAgent {
        Connection userAgent(String userAgent);
    }

    public static void main(String[] args) {
        HttpConnectionTest.HttpConnection connect = new HttpConnection();

        MethodUnderTest connectMethod = methodUnderTest("connect");
        Proxy proxyProxy = mock(Proxy.class, times(1));

        MethodUnderTest proxyMethod = methodUnderTest("proxy");
        UserAgent userAgentUseragent = mock(UserAgent.class);

        MethodUnderTest dataMethod = methodUnderTest("data");
        Map<String, String> dataMapData = new HashMap<>();

        MethodUnderTest postDataCharsetMethod = methodUnderTest("postDataCharset");
    }

    @Test
    public void data_WithMock() {
        // Arrange
        String keyval = "key=value";

        // Act and Assert
        Connection result = mock(Connection.class);
        when(data(keyval)).thenReturn(result);

        MethodUnderTest methodUnderTestData = methodUnderTest("data");
        Connection dataConnection = mock(Connection.class);
        when(methodUnderTestData.data(keyval)).thenReturn(dataConnection);

        Document document = null;
        result = methodUnderTestData.post().execute();
        assertEquals(document, result.get());
    }

}