package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.PowerMock;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedIsInitialized[]

Test {

    @Mock
    private ConfigurationSource cfg;

    public CssFormatter testConfigurationSource () {
        return new CssFormatter();
    }

    @Before
    public void setup () {
        PowerMockito.mockStatic(ConfigurationSource.class);
    }

    @After
    public void tearDown () {
        PowerMock.revertAll();
    }

    @Test
    public void isInitialized[] Test() {
        CssFormatter formatter = testConfigurationSource();

        assertTrue(formatter.isInitialized());
    }

}