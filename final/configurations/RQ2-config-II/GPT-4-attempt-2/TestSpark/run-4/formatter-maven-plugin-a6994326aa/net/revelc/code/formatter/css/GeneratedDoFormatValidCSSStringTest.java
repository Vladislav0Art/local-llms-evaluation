package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatValidCSSStringTest {

    @Test
    public void doFormatValidCSSStringTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSource());

        String validCss = "body { color: red; }";
        String result = cssFormatter.doFormat(validCss, LineEnding.AUTO);
        assertThat(result, is(validCss));
    }

}