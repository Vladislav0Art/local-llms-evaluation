package org.jsoup.helper;

public class GeneratedAppendKeyValWithInvalidKeyAndValueReturnsCorrectQueryString {

    @Test
    public void appendKeyValWithInvalidKeyAndValueReturnsCorrectQueryString() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal(null, null);

        // when
        StringBuilder q = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);

        // then
        assertEquals("?key=value", q.toString());
    }

    private String decodePart(String encoded) {
        try {
            return URLDecoder.decode(encoded, UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // wtf!
        }
    }

    private void appendToAscii(String s, boolean spaceAsPlus, StringBuilder sb) throws UnsupportedEncodingException {
        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            if (c == ' ') {
                sb.append(spaceAsPlus ? '+' : "%20");
            } else if (c > 127) { // out of ascii range
                sb.append(URLEncoder.encode(new String(Character.toChars(c)), UTF_8.name()));
            } else {
                sb.append((char) c);
            }
        }
    }

}