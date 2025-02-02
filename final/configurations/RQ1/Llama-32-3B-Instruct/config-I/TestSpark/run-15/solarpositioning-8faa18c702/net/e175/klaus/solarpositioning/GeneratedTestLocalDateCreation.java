package net.e175.klaus.solarpositioning;

public class GeneratedTestLocalDateCreation {

    private static DeltaT deltaT;

    @BeforeClass
    public static void setUp() {
        deltaT = new DeltaT();
    }

    @Test
    public void testLocalDateCreation() {
        LocalDate forDate = LocalDate.of(2024, 1, 15);
        System.out.println(forDate);
    }

}