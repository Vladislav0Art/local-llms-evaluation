package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest_stylesheet_with_css {

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
    public void test_stylesheet_with_css() {
        AbstractCacheableFormatter formatter = new CssFormatter();
        String stylesheet = "/* Test stylesheet */\npixel {\n  color: red;\n}\n";
        CSSFormat format = formatter.doFormat(stylesheet, LineEnding.CRLF);
        Assert.assertNotNull(format.getCssBody());
        Assert.assertEquals("pixel {", format.getCssBody().getCssText());
    }

}