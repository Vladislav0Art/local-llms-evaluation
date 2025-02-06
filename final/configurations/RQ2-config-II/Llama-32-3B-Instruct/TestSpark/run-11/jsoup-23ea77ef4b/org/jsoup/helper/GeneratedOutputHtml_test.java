package org.jsoup.helper;

public class GeneratedOutputHtml_test {

    @Test
    public void OutputHtml_test() {
        Document doc = createDocument();
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertEquals("output:html", output.get("output"));
    }

}