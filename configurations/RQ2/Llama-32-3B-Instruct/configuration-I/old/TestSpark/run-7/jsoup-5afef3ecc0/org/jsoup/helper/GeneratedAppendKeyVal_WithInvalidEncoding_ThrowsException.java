package org.jsoup.helper;

public class GeneratedAppendKeyVal_WithInvalidEncoding_ThrowsException {

    @Test
    public void appendKeyVal_WithInvalidEncoding_ThrowsException() {
        URL inputUrl = createMockUrl();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(createMockKeyVal()));
    }

    private static URL createMockUrl() {
        return null; // implement this according to your mock implementation
    }

    private static class MockKeyVal implements Connection.KeyVal {
        int count;

        public void incrementCount() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

}