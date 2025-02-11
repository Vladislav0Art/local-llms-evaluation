package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGetDirectiveAnnotations {

    @Test
    public void testGetDirectiveAnnotations() {
        Directive directive = new Directive("testDirective");
        List list = (List) directive.getDirectiveAnnotations();
        for (Object obj : list) {
            GraphQLDirective annotation = (GraphQLDirective) obj;
            System.out.println(annotation);
        }
    }

}