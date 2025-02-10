package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedCreate_returnsProperties {

    @Mock
    private Property<?> property;

    @Mock
    private List<Property<?>> list;

    @Mock
    private Map<String, Object> map;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(property.getConfigurationData()).thenReturn(map);
        when(property.getProperty()).thenReturn("test");
    }

    @Test
    public void create_returnsProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertTrue(!properties.isEmpty());
    }

}