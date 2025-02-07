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
public class GeneratedDoFormat_NullCode_ThrowsNullPointerException {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat_NullCode_ThrowsNullPointerException() {
        LineEnding ending = new LineEnding();
        assertThrows(NullPointerException.class, () -> formatter.doFormat(null, ending));
    }

}