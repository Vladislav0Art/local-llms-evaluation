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

public class GeneratedAddUniquePropertiesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private PropertyListBuilder underTest = new PropertyListBuilder();

    // Test for add method

    @Test
    public void addUniquePropertiesTest() {
        // Given
        Property<?> property1 = new IntegerProperty("DataSource.mysql.Port", 3306);
        Property<?> property2 = new IntegerProperty("DataSource.mysql.MaxConnections", 10);
        Property<?> property3 = new IntegerProperty("Security.LoginAttempts", 5);

        // When
        underTest.add(property1);
        underTest.add(property2);
        underTest.add(property3);

        // Then
        List<Property<?>> properties = underTest.create();
        assertThat(properties, contains(property1, property2, property3));
    }

}