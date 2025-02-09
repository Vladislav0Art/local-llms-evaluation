package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initDefaultParametersTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertThat(cssFormatter.isInitialized(), is(false));

        cssFormatter.init(new HashMap<>(), new ConfigurationSource());
        assertThat(cssFormatter.isInitialized(), is(true));
    }

    @Test
    public void initNullParametersTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

    @Test
    public void isInitializedByDefaultTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertThat(cssFormatter.isInitialized(), is(false));
    }

    @Test
    public void doFormatEmptyStringTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSource());

        String result = cssFormatter.doFormat("", LineEnding.AUTO);
        assertThat(result, is(""));
    }

    @Test
    public void doFormatValidCSSStringTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSource());

        String validCss = "body { color: red; }";
        String result = cssFormatter.doFormat(validCss, LineEnding.AUTO);
        assertThat(result, is(validCss));
    }

    @Test
    public void doFormatInvalidCSSStringTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSource());

        String invalidCss = "body { color red }";
        cssFormatter.doFormat(invalidCss, LineEnding.AUTO);
    }

}