package app;

public class GeneratedTestUpdateTable {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        CSVReader reader = new CSVReader();
        String[] fields = {"id", "name"};
        reader.read(fields);
        CSVWriter writer = new CSVWriter();

        // update data in table
        try {
            initTable(writer, reader, null, null, null);
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }

        Iterator<String[]> iterator = getReader().iterator();
        while (iterator.hasNext()) {
            String[] values = iterator.next();
            try {
                updateTable(values[0], values[1]);
            } catch (DBAppException e) {
                throw new RuntimeException(e);
            }
        }
    }

}