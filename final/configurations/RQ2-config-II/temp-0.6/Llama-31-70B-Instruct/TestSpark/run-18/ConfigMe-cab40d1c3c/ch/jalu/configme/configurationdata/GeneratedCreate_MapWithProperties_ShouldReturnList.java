package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreate_MapWithProperties_ShouldReturnList {

    @Mock
    private Property<String> property;

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_MapWithProperties_ShouldReturnList() {
        when(property.getPath()).thenReturn("path.to.property");
        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}