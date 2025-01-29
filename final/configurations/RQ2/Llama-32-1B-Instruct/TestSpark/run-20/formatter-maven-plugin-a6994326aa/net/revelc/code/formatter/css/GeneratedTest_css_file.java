package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest_css_file {

    @Before
    public void setup() {
        System.out.println("Setup method called");
        GeneratedTest.generatePublicClass();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown method called");
    }

    @Test
    public void test_css_file() {
        AbstractCacheableFormatter formatter = new CssFormatter();
        String formattedCode = formatter.doFormat(CODE, LineEnding.CRLF);
        Assert.assertEquals("body {\n  background-color: #f2f2f2;\n}", formattedCode);
    }

}