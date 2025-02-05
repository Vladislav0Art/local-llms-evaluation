package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedAddMockedPropertyTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addMockedPropertyTest() {
        Property mockProperty = Mockito.mock(Property.class);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);
    }

}