package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedGetRootEntriesWithMockedPropertyTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getRootEntriesWithMockedPropertyTest() {
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("mockPath");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("mockValue");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);
        assert builder.getRootEntries().get("mockPath").equals("mockValue");
    }

}