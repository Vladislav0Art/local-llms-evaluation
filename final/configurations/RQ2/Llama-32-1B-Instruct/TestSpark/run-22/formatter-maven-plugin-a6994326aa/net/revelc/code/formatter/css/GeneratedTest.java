package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private String expectedCss = "<style>\n" +
            " * body {\n" +
            "     background-color: #f2f2f2;\n" +
            "}\n" +
            "</style>";

    @Before
    public void init() {
        this.isInitialized = true;
    }

    @After
    public void tearDown() {
        System.out.println("Test CssGenerator initialized successfully");
    }

    public String generateCss(String selector, String[] styles) {
        return "/*\n" +
                " * " + selector + "\n" +
                "*/{\n" +
                " " + styles[0] + ";\n" +
                "}\n\n";
    }

}