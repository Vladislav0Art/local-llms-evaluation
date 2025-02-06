package org.jsoup.helper;

public class GeneratedOutputXml_test {

    @Test
    public void OutputXml_test() {
        Document doc = createDocument();
        HashMap<String, String> output = W3CDom.OutputXml();
        assertEquals("output:xslt", output.get("output"));
    }

}