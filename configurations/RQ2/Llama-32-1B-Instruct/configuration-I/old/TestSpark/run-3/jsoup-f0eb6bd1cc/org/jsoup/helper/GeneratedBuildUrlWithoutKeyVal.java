package org.jsoup.helper;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import org.junit.jupiter.api.Test;

public class GeneratedBuildUrlWithoutKeyVal {

    @Test
    public void buildUrlWithoutKeyVal() {
        Node node = Node.newString();
        UrlBuilder builder = new UrlBuilder("https://www.example.com");
        String url = builder.build().toString(3);
        assertEquals("https://www.example.com", url);
    }

}