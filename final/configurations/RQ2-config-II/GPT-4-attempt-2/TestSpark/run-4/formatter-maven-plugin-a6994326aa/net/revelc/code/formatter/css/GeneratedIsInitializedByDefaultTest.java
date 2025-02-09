package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitializedByDefaultTest {

    @Test
    public void isInitializedByDefaultTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertThat(cssFormatter.isInitialized(), is(false));
    }

}