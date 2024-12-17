package org.jsoup.nodes;

import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedTestIsXmlDeclaration {

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
    public void testIsXmlDeclaration() {
        String data = "This is an XML Declaration.";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}