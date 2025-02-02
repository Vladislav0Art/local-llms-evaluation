package org.jsoup.nodes;

public class Generated[MethodUnderTest]

LastCharIsWhitespace {

    private static String inputText = "";

    @Test
    public void [MethodUnderTest]LastCharIsWhitespace() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            if (!lastCharIsWhitespace(sb)) {
                break;
            }
        }
        assertEquals("text", sb.toString());
    }

}