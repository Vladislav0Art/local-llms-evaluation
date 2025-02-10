package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat[]

Test_Failing {

    @Mock
    private ConfigurationSource cfg;

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat[] Test_Failing() throws IOException {
        String input = "inputContent";
        LineEnding ending = LineEnding.CRLF;
        CssFormat cssFormat = new CssFormat("cssFormat");

        when(cfg.getOption(anyString())).thenReturn("optionValue");
        when(cfg.isInitialized()).thenReturn(true);

        when(formatter.doFormat(input, ending)).thenReturn(null);
        assertNull(formatter.doFormat(input, ending));
    }

}