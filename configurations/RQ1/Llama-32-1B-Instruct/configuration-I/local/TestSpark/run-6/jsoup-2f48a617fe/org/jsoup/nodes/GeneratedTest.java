package org.jsoup.nodes;

import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedTest {

    public String nodeName() {
        return "#comment";
    }

    public void setData(String data) {
        this.value = data;
    }
}

public class CommentNodeUtils {
    public static CommentNode parser(Document document, ParseSettings settings) throws IOException {
        // parse the comment string into a Document object
        return document.body().child(0);
    }

    public static CommentNode asXmlDeclaration(String data) {
        // use the HTML parser to get the XML declaration
        return parser(new Parser().settings(settings).parseInput("<![CDATA[\n" + data + "\n]]>").body());
    }
}

public class XmlDeclaration {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class CommentTest {

    @Test
    public void testCommentConstructor() {
        Comment comment = new Comment("This is a comment.");
        Assert.assertEquals("#comment", comment.nodeName());
        Assert.assertEquals("", comment.getData());
    }

    @Test
    public void testCommentToString() {
        Comment comment = new Comment("This is a comment.");
        String expected = "<!--\nThis is a comment.—>\n";
        Assert.assertEquals(expected, comment.toString());
    }

    @Test
    public void testIsXmlDeclaration() {
        String data = "This is an XML Declaration.";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        String data = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
                "\n" +
                "   <html>\n" +
                "       <head>\n" +
                "           <title>Test</title>\n" +
                "       </head>\n" +
                "   </html>\n";
        CommentNode comment = CommentNodeUtils.parser(new Parser().settings(new ParseSettings()).parseInput(data), null);
        XmlDeclaration xmlDecl = new CommentNodeUtils.XmlDeclaration(comment, data);
        Assert.assertNotNull(xmlDecl);
    }

    @Test
    public void testCommentIsXmlDeclaration() {
        String data = "This is an XML Declaration.";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.isXmlDeclaration());
        Assert.assertEquals("This is an XML Declaration.", comment.getContent());
    }

    @Test
    public void testCommentSetData() {
        String data = "";
        Comment comment = new Comment(data);
        comment.setData("This is a comment.");
        Assert.assertEquals("", comment.getData());
        Assert.assertEquals(0, comment.value.length());
    }

}