package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildArgumentTypes {

    @Test
    public void buildArgumentTypes() {
        GraphQLDirectives directives = new GraphQLDirectives("directives");
        List<GraphQLType> argumentTypes = Arrays.asList(Mockito.mock(GraphQLType.class), Mockito.mock(GraphQLType.class));
        assertSame(argumentTypes, buildArgumentTypes(directives));
    }

}