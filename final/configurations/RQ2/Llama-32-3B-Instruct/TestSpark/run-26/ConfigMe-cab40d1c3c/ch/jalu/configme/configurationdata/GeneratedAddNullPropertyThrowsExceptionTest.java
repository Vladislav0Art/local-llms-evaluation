package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddNullPropertyThrowsExceptionTest {

    @Test
    public void addNullPropertyThrowsExceptionTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> builder.add(null));
    }

}