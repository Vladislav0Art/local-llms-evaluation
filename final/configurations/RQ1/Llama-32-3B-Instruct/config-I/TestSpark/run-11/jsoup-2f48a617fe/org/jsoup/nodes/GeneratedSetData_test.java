package org.jsoup.nodes;

public class GeneratedSetData_test {

    private Comment clonedComment;

    public Comment(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Comment clone() {
        this.clonedComment = new Comment(this.value);
        return clonedComment;
    }
}

public class GeneratedTest {

    @Mock
    private Document document;

    @Mock
    private Parser parser;

    @Mock
    private Appendable accum;

    @Before
    public void setup() {
        Mockito.when(parser.parseInput("", null)).thenReturn(document);
        Mockito.when(document.body().child(0).tagName()).thenReturn("");
        Mockito.when(document.body().child(0).attributes()).thenReturn(null);
    }

    @Test
    public void setData_test() {
        Comment comment = new Comment("");
        comment.setData("test");
        Mockito.verify(comment, Mockito.times(1)).setValue(Mockito.anyString());
        Mockito.verify(document, Mockito.times(1)).tagName();
        Mockito.verify(document, Mockito.times(1)).body().child(0).tagName();
        Mockito.verify(document, Mockito.times(1)).body().child(0).attributes();
    }

}