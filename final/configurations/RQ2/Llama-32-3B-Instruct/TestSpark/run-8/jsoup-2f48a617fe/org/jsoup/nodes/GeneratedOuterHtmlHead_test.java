package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_test {

    private String data;

    public Comment() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class GeneratedTest {

    @Test
    public void outerHtmlHead_test() throws IOException {
        Comment comment = new Comment();
        Appendable accum = new java.io.StringWriter();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
        // implementation
    }

}