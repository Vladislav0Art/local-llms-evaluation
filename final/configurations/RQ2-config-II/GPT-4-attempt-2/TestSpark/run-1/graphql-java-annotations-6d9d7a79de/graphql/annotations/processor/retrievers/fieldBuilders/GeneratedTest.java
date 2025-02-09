package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildWhenAnnotatedElementExceptionTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Field field = Mockito.mock(Field.class);

        when(container.getTypeRetriever()).thenThrow(new GraphQLAnnotationsException("Exception"));

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

    @Test
    public void buildWithValidScenarioTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method method = Mockito.mock(Method.class);
        DirectiveJavaAnnotationUtil util = Mockito.mock(DirectiveJavaAnnotationUtil.class);

        when(container.getDirectiveJavaAnnotationUtil()).thenReturn(util);
        when(util.getGraphQLDirective(Mockito.any())).thenReturn(GraphQLDirective.newDirective().name("test"));

        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();

        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("test", result[0].getName());
    }

    @Test
    public void DirectivesBuilderNullContainerTest() {
        Field field = Mockito.mock(Field.class);

        new DirectivesBuilder(field, null);
    }

    @Test
    public void DirectivesBuilderNullAnnotatedElementTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        new DirectivesBuilder(null, container);
    }

}