package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitNullParametersTest {

    @Test
    public void initNullParametersTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

}