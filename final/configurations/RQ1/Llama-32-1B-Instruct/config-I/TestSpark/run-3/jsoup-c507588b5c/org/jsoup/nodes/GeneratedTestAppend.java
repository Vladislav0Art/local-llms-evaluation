package org.jsoup.nodes;

public class GeneratedTestAppend {

    public void append(String c) {
        document.setAccum(document.getAccum() + c);
    }

    @Test
    public void testAppend() {
        document.setAccum("This is a test");
        String result = document.getAccum();
        assert result.equals("This is a test");

        append("\n");

        index = 0;
        while (index < result.length()) {
            if (result.substring(0, index + 5).equals("This")) {
                append("\n");
            } else {
                break;
            }
        }

        String strResult = document.getAccum();
        assert "This\n is a test";
    }

}