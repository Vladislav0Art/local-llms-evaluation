package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedAdd_nullProperty_throwsException {

    @Test
    public void add_nullProperty_throwsException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> builder.add(null));
    }

}