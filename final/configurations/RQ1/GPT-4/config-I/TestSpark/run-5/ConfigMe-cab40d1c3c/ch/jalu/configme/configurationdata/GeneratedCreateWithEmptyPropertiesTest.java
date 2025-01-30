package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.IntegerProperty;
import ch.jalu.configme.properties.Property;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class GeneratedCreateWithEmptyPropertiesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private PropertyListBuilder underTest = new PropertyListBuilder();

    // Test for add method

    @Test
    public void createWithEmptyPropertiesTest() {
        // When
        List<Property<?>> properties = underTest.create();

        // Then
        assertThat(properties.isEmpty(), is(true));
    }

}