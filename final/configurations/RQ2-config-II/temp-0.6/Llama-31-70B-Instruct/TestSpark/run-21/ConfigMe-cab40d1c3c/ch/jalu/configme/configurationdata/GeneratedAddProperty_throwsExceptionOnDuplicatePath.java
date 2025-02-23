package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedAddProperty_throwsExceptionOnDuplicatePath {

    @Test
    public void addProperty_throwsExceptionOnDuplicatePath() {
        // Arrange
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("some.path");

        // Act
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}