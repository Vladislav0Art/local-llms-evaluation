package org.jsoup.nodes;

public class GeneratedGetWholeTextIncludesAllNodesAndWhitespace {

    @Test
    public void getWholeTextIncludesAllNodesAndWhitespace() throws IOException {
        Document document = new Document();
        Element[] nodes = {node("text1"), node("text2")};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        Document.OutputSettings settings = Document.OutputSettings.builder().build(); // Update to builder method
        document.output(settings, accum);
        String result = out.toString();
        assertTrue(result.contains("text1"));
        assertTrue(result.contains("text2"));
    }

}