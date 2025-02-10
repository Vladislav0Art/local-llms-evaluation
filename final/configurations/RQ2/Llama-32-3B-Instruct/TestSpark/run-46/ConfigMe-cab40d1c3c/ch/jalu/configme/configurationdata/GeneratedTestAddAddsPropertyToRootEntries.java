package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddAddsPropertyToRootEntries {

    @PrepareForTest(PropertyListBuilder.class)
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private PropertyListBuilder builder;

    @Mock
    private Property property;

    @Mock
    private List<Property> properties;

    @Mock
    private Map<String, Object> map;

    @Test
    public void testAddAddsPropertyToRootEntries() {
        // Arrange
        when(builder.getRootEntries()).thenReturn(map);

        // Act
        builder.add(property);
        map.put("property", property);

        // Assert
        verify(map).put("property", property);
    }

}