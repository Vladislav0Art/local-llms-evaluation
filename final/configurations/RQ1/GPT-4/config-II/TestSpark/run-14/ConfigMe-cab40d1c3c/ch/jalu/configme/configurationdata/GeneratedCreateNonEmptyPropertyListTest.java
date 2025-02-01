package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateNonEmptyPropertyListTest {

    @Test
    public void createNonEmptyPropertyListTest() {
        Property<String> prop1 = Mockito.mock(Property.class);
        Property<String> prop2 = Mockito.mock(Property.class);
        Mockito.when(prop1.getPath()).thenReturn("path1");
        Mockito.when(prop2.getPath()).thenReturn("path2");
        PropertyListBuilder builder = new PropertyListBuilder();

        builder.add(prop1);
        builder.add(prop2);
        List<Property<?>> list = builder.create();

        assertEquals(2, list.size());
    }

}