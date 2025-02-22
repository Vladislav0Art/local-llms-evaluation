package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        directivesBuilder = new DirectivesBuilder();
    }

    @Test
    public void transformArgs_withAnnotation_shouldReturnGraphQLDirective() {
        GraphQLDirective graphQLDirective = directivesBuilder.transformArgs(new GraphQLDirective(), new Annotation());

        assertEquals(graphQLDirective, new GraphQLDirective());
    }

    @Test
    public void transformArgs_withStringArray_shouldReturnGraphQLDirective() {
        GraphQLDirective graphQLDirective = directivesBuilder.transformArgs(new GraphQLDirective(), new String[]{});

        assertEquals(graphQLDirective, new GraphQLDirective());
    }

}