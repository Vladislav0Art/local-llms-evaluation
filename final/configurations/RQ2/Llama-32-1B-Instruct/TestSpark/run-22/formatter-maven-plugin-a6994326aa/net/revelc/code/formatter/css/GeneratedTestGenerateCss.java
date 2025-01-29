package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGenerateCss {

    private String expectedCss;

    @Before
    public void init() {
        this.expectedCss = "<style>\n" +
                " * body {\n" +
                "     background-color: #f2f2f2;\n" +
                "}\n" +
                "</style>";
    }

    @Test
    public void testGenerateCss() {
        String[] styles = {"background-color: #f2f2f2", "color: red"};
        assertEquals(expectedCss, generateCss("body", styles));
    }

}