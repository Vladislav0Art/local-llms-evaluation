package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_NullOptions_ThrowsNullPointerException {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_NullOptions_ThrowsNullPointerException() {
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(NullPointerException.class, () -> formatter.init(null, cfg));
    }

}