package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatEmptyStringTest {

    @Test
    public void doFormatEmptyStringTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSource());

        String result = cssFormatter.doFormat("", LineEnding.AUTO);
        assertThat(result, is(""));
    }

}