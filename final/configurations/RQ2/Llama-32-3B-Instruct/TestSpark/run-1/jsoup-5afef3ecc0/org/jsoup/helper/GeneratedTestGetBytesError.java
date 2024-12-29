package org.jsoup.helper;

public class GeneratedTestGetBytesError {

    @Test
    public void testGetBytesError() {
        UrlBuilder.Connection connection = new UrlBuilder.Connection();
        connection.setBytes(new byte[]{1, 2, 3});
        try {
            String result = null;
            assertThrows(UnsupportedEncodingException.class, () -> String.valueOf(result));
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}