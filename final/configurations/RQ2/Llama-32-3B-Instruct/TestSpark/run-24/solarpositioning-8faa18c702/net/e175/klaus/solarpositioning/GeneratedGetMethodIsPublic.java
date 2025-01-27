package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMethodIsPublic {

    @Mock
    private sunPositioningService SunPositioningServiceMock;

    @Test
    public void getMethodIsPublic() {
        assertIsPublic(DeltaT.class.getMethod("estimate", LocalDate.class));
    }

}