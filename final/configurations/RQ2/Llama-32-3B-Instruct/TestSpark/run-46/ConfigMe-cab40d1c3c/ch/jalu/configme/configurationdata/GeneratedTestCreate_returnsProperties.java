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

public class GeneratedTestCreate_returnsProperties {

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
    public void testCreate_returnsProperties() {
        // Arrange
        when(builder.getRootEntries()).thenReturn(map);

        // Act
        properties = new ArrayList<>();
        properties.add(property);
        List<Property> list = builder.create();

        // Assert
        verify(list).addAll(properties);
        verify(map).put("properties", list);
    }

}