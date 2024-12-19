package org.jsoup.helper;

public class GeneratedAppendToAsciiHandlesSpaceAsPlus {

    @Test
    public void appendToAsciiHandlesSpaceAsPlus() {
        // given
        StringBuilder sb = StringUtil.borrowBuilder();
        urlBuilder.appendToAscii("Hello, World!", true, sb);

        // when
        String result = StringUtil.releaseBuilder(sb).toString();

        // then
        assert result.equals(IDN.toASCII("Hello%20World!"));
    }

}