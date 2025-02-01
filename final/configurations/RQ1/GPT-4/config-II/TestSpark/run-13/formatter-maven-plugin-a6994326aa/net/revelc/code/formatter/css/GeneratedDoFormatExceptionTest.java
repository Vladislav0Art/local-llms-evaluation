package net.revelc.code.formatter.css;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatExceptionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void doFormatExceptionTest() throws IOException {
        exceptionRule.expect(IOException.class);
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("", null);
    }

}