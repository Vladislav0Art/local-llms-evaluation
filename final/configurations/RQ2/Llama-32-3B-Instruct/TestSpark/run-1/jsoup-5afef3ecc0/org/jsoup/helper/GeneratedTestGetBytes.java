package org.jsoup.helper;

public class GeneratedTestGetBytes {

    @Test
    public void testGetBytes() {
        UrlBuilder.Connection connection = new UrlBuilder.Connection();
        connection.setBytes(new byte[]{1, 2, 3});
        try {
            String result = connection.getBytes();
            assertEquals("UTF-8", result);
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

}