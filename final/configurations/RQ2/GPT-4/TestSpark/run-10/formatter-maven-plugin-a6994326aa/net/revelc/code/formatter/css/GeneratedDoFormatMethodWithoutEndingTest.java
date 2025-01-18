package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatMethodWithoutEndingTest {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatMethodWithoutEndingTest() throws Exception {
        String code = ".class {color: red;}";
        LineEnding ending = LineEnding.KEEP;
        String expectedCode = ".class {color: red;}";
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertThat(formattedCode).isEqualTo(expectedCode);
    }

}