package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_test {

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
    public void outerHtmlTail_test() {
        Comment comment = new Comment();
        Appendable accum = new java.io.StringWriter();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        // implementation
    }

}