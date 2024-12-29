package app;

public class GeneratedTestReadAllValues {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testReadAllValues() throws DBAppException {
        CSVReader reader = new CSVReader();

        // read all values from CSV
        String[] fields = {"id", "name"};
        reader.read(fields);

        Iterator<String[]> iterator = reader.iterator();
        while (iterator.hasNext()) {
            String[] values = iterator.next();
            System.out.println(values[0] + ", " + values[1]);
        }

        try {
            // close reader
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }

}