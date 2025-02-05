package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddNullTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addNullTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        thrown.expect(NullPointerException.class);
        builder.add(null);
    }

}