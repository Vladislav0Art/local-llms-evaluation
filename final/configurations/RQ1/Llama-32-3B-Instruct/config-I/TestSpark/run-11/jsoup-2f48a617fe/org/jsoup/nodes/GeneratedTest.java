package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public Comment() {
    }

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
        return new Comment(this.value);
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
        Mockito.verify(comment, Mockito.times(1)).coreValue(Mockito.anyString());
        Mockito.verify(document, Mockito.times(1)).tagName();
        Mockito.verify(document, Mockito.times(1)).body().child(0).tagName();
        Mockito.verify(document, Mockito.times(1)).body().child(0).attributes();
    }

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("test");
        Mockito.when(parser.parseInput("", null)).thenReturn(document);
        Mockito.when(document.body().child(0).tagName()).thenReturn("");
        Mockito.when(document.body().child(0).attributes()).thenReturn(null);
        boolean result = comment.isXmlDeclaration();
        Mockito.verify(document, Mockito.times(1)).tagName();
    }

    @Test
    public void asXmlDeclaration_test() {
        Comment comment = new Comment("test");
        XmlDeclaration decl = comment.asXmlDeclaration();
        Mockito.verify(parser, Mockito.times(1)).parseInput(Mockito.anyString(), null);
        Mockito.verify(document, Mockito.times(2)).tagName();
        Mockito.verify(document, Mockito.times(3)).body().child(0).tagName();
    }

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("");
        Mockito.when(document.tagName()).thenReturn("#comment");
        String nodeName = comment.nodeName();
        Mockito.verify(nodeName);
    }

}