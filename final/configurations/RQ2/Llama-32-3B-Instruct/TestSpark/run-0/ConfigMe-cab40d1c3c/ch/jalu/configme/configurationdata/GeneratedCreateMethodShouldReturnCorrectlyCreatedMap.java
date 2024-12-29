package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RunWith(PowerMockRunner.class)
public class GeneratedCreateMethodShouldReturnCorrectlyCreatedMap {

    @Mock
    private PropertyListBuilder propertyListBuilderMock;

    @Mock
    private Property propertyMock;

    @Mock
    private List<Property> listMock;

    @Mock
    private Map<String, Object> mapMock;

    public void setup() {
        PowerMockito.mockStatic(Property.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createMethodShouldReturnCorrectlyCreatedMap() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(propertyMock);
        result = new PropertyListBuilder().add(properties.get(0)).create();
        assertEquals(mapMock, result);
        PowerMockito.verifyNoMoreInteractions(propertyListBuilderMock, propertyMock);
    }

}