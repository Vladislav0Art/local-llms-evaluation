package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProperty_ExistingProperty_ShouldThrowException {

    @Mock
    private Property<String> property;

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_ExistingProperty_ShouldThrowException() {
        when(property.getPath()).thenReturn("path.to.property");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}