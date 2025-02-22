package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class GeneratedAddProperty_existingProperty_exceptionIsThrown {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_existingProperty_exceptionIsThrown() throws Exception {
        Property property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);

        propertyListBuilder.add(property);
    }

}