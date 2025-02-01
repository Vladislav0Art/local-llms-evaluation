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
public class GeneratedIsInitializedFalseTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}