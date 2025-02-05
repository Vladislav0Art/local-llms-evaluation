package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedAddNullPropertyTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        thrown.expect(NullPointerException.class);
        builder.add(null);
    }

}