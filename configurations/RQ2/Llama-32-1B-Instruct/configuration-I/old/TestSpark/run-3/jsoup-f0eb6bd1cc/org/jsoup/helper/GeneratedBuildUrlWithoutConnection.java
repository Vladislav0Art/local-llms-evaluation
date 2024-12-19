package org.jsoup.helper;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import org.junit.jupiter.api.Test;

public class GeneratedBuildUrlWithoutConnection {

    @Test
    public void buildUrlWithoutConnection() {
        URL inputUrl = "https://www.example.com";
        String url = (String) UrlBuilder.build().toString(3);
        assertEquals(inputUrl, url);
    }

}