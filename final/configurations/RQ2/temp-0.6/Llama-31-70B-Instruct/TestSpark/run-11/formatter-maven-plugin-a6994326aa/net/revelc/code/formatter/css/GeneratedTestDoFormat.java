package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.AbstractCacheableFormatter;

import java.io.IOException;
import java.util.Map;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        String code = "testCode";
        LineEnding ending = mock(LineEnding.class);
        CssFormatter testObject = new CssFormatter();
        String result = testObject.doFormat(code, ending);
        assertNotNull(result);
    }

}