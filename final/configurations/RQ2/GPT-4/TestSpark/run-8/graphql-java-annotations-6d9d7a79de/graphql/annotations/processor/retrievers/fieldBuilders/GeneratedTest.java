package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void buildEmptyDirectivesTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertNotNull(directives);
        Assert.assertEquals(0, directives.length);
    }

}