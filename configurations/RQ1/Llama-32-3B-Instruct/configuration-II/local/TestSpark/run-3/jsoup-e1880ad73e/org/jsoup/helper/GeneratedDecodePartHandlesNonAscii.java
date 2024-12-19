package org.jsoup.helper;

public class GeneratedDecodePartHandlesNonAscii {

    @Test
    public void decodePartHandlesNonAscii() {
        // given
        String encoded = "äöüß";

        // when
        String decoded = UrlBuilder.decodePart(encoded);

        // then
        assert decoded.equals(StringUtil.releaseBuilder(IDN.toASCII("äöüß")).toString());
    }

}