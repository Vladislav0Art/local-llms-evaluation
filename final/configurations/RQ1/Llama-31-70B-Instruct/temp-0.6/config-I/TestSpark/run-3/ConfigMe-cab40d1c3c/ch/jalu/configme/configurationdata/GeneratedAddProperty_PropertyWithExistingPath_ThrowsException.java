package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedAddProperty_PropertyWithExistingPath_ThrowsException {

    private PropertyListBuilder propertyListBuilder;
    private Property<String> property;

    @BeforeEach
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
        property = Mockito.mock(Property.class);
    }

    @Test
    public void addProperty_PropertyWithExistingPath_ThrowsException() {
        Mockito.when(property.getPath()).thenReturn("property.path");
        propertyListBuilder.add(property);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}