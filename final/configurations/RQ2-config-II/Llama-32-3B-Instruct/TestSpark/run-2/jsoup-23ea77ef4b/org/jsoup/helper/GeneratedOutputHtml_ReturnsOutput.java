package org.jsoup.helper;

public class GeneratedOutputHtml_ReturnsOutput {

    @Test
    public void OutputHtml_ReturnsOutput() {
        // arrange
        Properties expected = new Properties();

        // act
        Map<String, String> output = W3CDom.OutputHtml();

        // assert
        assertEquals(expected, output);
    }

}