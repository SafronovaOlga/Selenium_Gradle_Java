import org.junit.jupiter.api.Assertions;import org.junit.jupiter.api.Test;import java.util.Arrays;import java.util.List;//import static org.mockito.Mockito.*;import static org.junit.jupiter.api.Assertions.assertEquals;public class MockListTest {    //    @Test//    void testMockList() {//        // Создаем mock-объект списка//        List<String> mockedList = mock(List.class);////        // Задаем поведение mock-объекта//        when(mockedList.get(0)).clone( );////        // Проверяем, что mock-объект работает как ожидается//        assertEquals("Hello", mockedList.get(0));//        verify(mockedList).get(0); // Проверяем, что метод был вызван//    }    //    @Test//    void testListContents() {//        List<String> fruits = Arrays.asList("apple", "banana", "orange");////        // Проверяем, что список содержит определенные элементы////        assertThat(fruits)////                .hasSize(3)////                .contains("banana")////                .doesNotContain("grape")////                .startsWith("apple");//    }}