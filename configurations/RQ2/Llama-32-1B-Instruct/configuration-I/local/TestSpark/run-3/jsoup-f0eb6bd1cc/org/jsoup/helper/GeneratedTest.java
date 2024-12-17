package org.jsoup.helper;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public String buildUrlWithoutKeyVal() {
        Node node = Node.newString();
        return (String) UrlBuilder.build().toString(3);
    }

    @Test
    public void appendKeyValWithEmptyMap() throws UnsupportedEncodingException {
        URL inputUrl = "https://www.example.com";
        Node node = new Node(new StringLiteralExpr(inputUrl));
        UrlBuilder builder = new UrlBuilder(node);
        methodCall(builder, 1, null);
        assertEquals(1, builder.getappendKeyVal().size());
    }

    @Test
    public void appendKeyValWithUnsupportedType() throws UnsupportedEncodingException {
        URL inputUrl = "https://www.example.com";
        Node node = new Node(new StringLiteralExpr(inputUrl));
        UrlBuilder builder = new UrlBuilder(node);
        methodCall(builder, null, null);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(null));
    }

    @Test
    public void appendKeyValWithNullKey() throws UnsupportedEncodingException {
        URL inputUrl = "https://www.example.com";
        Node node = new Node(new StringLiteralExpr(inputUrl));
        UrlBuilder builder = new UrlBuilder(node);
        methodCall(builder, 1, null);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(null));
    }

    @Test
    public void appendKeyValWithEmptyString() throws UnsupportedEncodingException {
        URL inputUrl = "https://www.example.com";
        Node node = new Node(new StringLiteralExpr(inputUrl));
        UrlBuilder builder = new UrlBuilder(node);
        methodCall(builder, 1, "");
    }

    private void methodCall(UrlBuilder builder, int argsCount, Object... args) throws UnsupportedEncodingException {
        if (args.length == 0) return;
        for (int i = 0; i < argsCount; i++) {
            MethodCallExpr callExpr = new MethodCallExpr("appendKeyVal", builder, args[i]);
            Node result = callExpr.accept(builder, null);
            if (result != null && result instanceof StringLiteralExpr) {
                builder.getappendKeyVal().add((StringLiteralExpr) result);
            }
        }
    }

}