package org.jsoup.helper;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import org.junit.jupiter.api.Test;

public class GeneratedAppendKeyValWithNullKey {

    public String buildUrlWithoutKeyVal() {
        Node node = Node.newString();
        return (String) UrlBuilder.build().toString(3);
    }

    @Test
    public void appendKeyValWithNullKey() throws UnsupportedEncodingException {
        URL inputUrl = "https://www.example.com";
        Node node = new Node(new StringLiteralExpr(inputUrl));
        UrlBuilder builder = new UrlBuilder(node);
        methodCall(builder, 1, null);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(null));
    }

}