package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTestAdd_WithDuplicatePath {

    @Test
    public void testAdd_WithDuplicatePath() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}