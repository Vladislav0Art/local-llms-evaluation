package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatThrowIOExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doFormatThrowIOExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        thrown.expect(IOException.class);
        formatter.doFormat(null, null);
    }

}