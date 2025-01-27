package app;

public class GeneratedTest {

    private String str = "SELECT * FROM users";

    public SQLTerm() {
    }

    public SQLTerm(String s1, String s2, String s3, Object o) {
        this.str = s1 + " " + s2 + " " + s3 + " " + o;
    }
}

public class DB {
    public Iterator<SQLTerm> selectFromTable(String arrSQLTerms, String[] strarrOperators) {
        // implementation of the selectFromTable method
        return new SQLIterator(arrSQLTerms, strarrOperators);
    }

    public static class SQLIterator implements java.util.Iterator<SQLTerm> {
        private final String arrSQLTerms;
        private final String[] strarrOperators;

        public SQLIterator(String arrSQLTerms, String[] strarrOperators) {
            this.arrSQLTerms = arrSQLTerms;
            this.strarrOperators = strarrOperators;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public SQLTerm next() {
            return null;
        }

        @Override
        public void remove() {
        }
    }

}

public class GeneratedTest {

    public DB db = new DB();

    public static String replace(String strarrSQLTerms, String[] arrSQLTermsArray, String strarrOperators) {
        for (int i = 0; i < arrSQLTermsArray.length; i++) {
            if (i > 0) strarrSQLTerms = strarrSQLTerms.replace(arrSQLTermsArray[i], "");
            strarrSQLTerms = strarrSQLTerms.replace(strarrOperators[i].toUpperCase(), "");
        }

        return strarrSQLTerms;
    }

    @Test
    public void testSelectFromTable() {
        String arrSQLTerms = "SELECT * FROM users WHERE name='John'";
        String[] arrSQLTermsArray = {"SELECT", "*", "FROM", "users"};
        String[] strarrOperators = {"AND", "OR"};

        for (int i = 0; i < arrSQLTermsArray.length; i++) {
            arrSQLTermsArray[i] = arrSQLTermsArray[i].toUpperCase();
        }

        String strarrSQLTermsModified = replace(arrSQLTerms, arrSQLTermsArray, strarrOperators);
        String strarrSQLTerms = "SELECT * FROM users";

        for (int i = 0; i < arrSQLTermsArray.length; i++) {
            if (i > 0) strarrSQLTerms += " ";
            strarrSQLTerms += arrSQLTermsArray[i];
        }

        strarrSQLTermsModified = replace(strarrSQLTermsModified, arrSQLTermsArray, strarrOperators);

        java.util.Iterator<SQLTerm> it = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(it.hasNext());
    }

}