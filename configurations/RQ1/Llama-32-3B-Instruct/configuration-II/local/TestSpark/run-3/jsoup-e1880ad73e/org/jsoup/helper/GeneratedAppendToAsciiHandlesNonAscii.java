package org.jsoup.helper;

public class GeneratedAppendToAsciiHandlesNonAscii {

    @Test
    public void appendToAsciiHandlesNonAscii() {
        // given
        StringBuilder sb = StringUtil.borrowBuilder();
        urlBuilder.appendToAscii("äöüß", false, sb);

        // when
        String result = StringUtil.releaseBuilder(sb).toString();

        // then
        assert result.equals(IDN.toASCII("äöü%ss"));
    }

}