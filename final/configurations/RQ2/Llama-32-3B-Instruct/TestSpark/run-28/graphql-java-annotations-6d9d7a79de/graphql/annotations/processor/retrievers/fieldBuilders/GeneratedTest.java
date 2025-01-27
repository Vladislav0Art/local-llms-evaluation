package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    public static String generateDirective(String directiveName) {
        return "new GraphQLDirectives(" + directiveName + ")";
    }

    public static List<String> generateTypes() {
        return Arrays.asList(
                "GraphQLType1",
                "GraphQLType2"
        );
    }
}

class GraphQLType1 {
}

class GraphQLType2 {
}

class GraphQLDirective implements Iterable<String> {
    private String name;

    public GraphQLDirective(String name) {
        this.name = name;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            boolean hasNext() {
                return true;
            }

            String next() {
                return name;
            }

            void remove() {
            }
        };
    }

    public List<String> getTypes() {
        return generateTypes();
    }
}

class GraphQLQueryExampleTest {

    @Test
    public void testGenerateDirective() {
        System.out.println(GraphQLQueryExample.generateDirective("directive1"));
    }

    @Test
    public void testGenerateTypes() {
        List<String> types = GraphQLQueryExample.generateTypes();
        for (String type : types) {
            System.out.println(type);
        }
    }

    @Test
    public void testGenerateDirectiveAndTypes() {
        String directiveName = "directive1";
        GraphQLDirectives directives = new GraphQLDirectives(directiveName);
        List<String> types = new ArrayList<>(directives.getTypes());
        for (String type : types) {
            System.out.println(type);
        }
    }

    @Test
    public void testCollectors() {
        List<String> collectibleList = Arrays.asList(
                "type1",
                "type2"
        );
        Collectors.toList(collectibleList).forEach(System.out::println);
    }

}