package ch.jalu.configme.configurationdata;

import static org.junit.jupiter.api.Assertions.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

public class GeneratedAddProperty_PathDoesNotExist_ThrowsException {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @AfterEach
    public void tearDown() {
        propertyListBuilder = null;
    }

    @Test
    public void addProperty_PathDoesNotExist_ThrowsException() {
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("property.path");

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}