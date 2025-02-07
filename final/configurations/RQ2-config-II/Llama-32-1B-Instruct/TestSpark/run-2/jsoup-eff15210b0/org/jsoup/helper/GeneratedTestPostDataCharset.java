package org.jsoup.helper;

public class GeneratedTestPostDataCharset {

    @Mock
    private Request request;

    @Test
    public void testPostDataCharset() {
        // Arrange
        String charset = "UTF-8";
        HttpConnection connection = new HttpConnection();
        when(connection.postDataCharset(charset)).thenReturn(null);

        // Act
        Connection.Response responseResult = connection.execute();

        // Assert
        assertNotNull(responseResult);
    }

}