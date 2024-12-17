package org.jsoup.nodes;

import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedTestAsXmlDeclaration {

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

}