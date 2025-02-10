package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat[]
Test fail {

@Mock
private ConfigurationSource cfg;

@Test
public void doFormat[]

Test fail() throws IOException {
    when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
    CssFormatter formatter = new CssFormatter();
    String input = "invalid css";
    try {
        formatter.doFormat(input, LineEnding.LF);
        assert false;
    } catch (IOException e) {
    }
}

}