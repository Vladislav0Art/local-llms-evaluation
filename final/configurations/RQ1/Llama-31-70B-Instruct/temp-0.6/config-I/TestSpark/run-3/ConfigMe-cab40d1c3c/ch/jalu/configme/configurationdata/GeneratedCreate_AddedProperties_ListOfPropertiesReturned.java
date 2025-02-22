package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedCreate_AddedProperties_ListOfPropertiesReturned {

    private PropertyListBuilder propertyListBuilder;
    private Property<String> property;

    @BeforeEach
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
        property = Mockito.mock(Property.class);
    }

    @Test
    public void create_AddedProperties_ListOfPropertiesReturned() {
        Mockito.when(property.getPath()).thenReturn("property.path");
        propertyListBuilder.add(property);
        List<Property<?>> expected = new ArrayList<>();
        expected.add(property);
        assertEquals(expected, propertyListBuilder.create());
    }

}