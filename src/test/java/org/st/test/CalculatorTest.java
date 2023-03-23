package org.st.test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.st.test.exception.AException;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private double num1;
    private double num2;
    private double expectedResult;
    private static Calculator calc;

    public CalculatorTest(double num1, double num2, double expectedResult) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}:mult({0},{1})= {2}")
    public static Collection<Object[]> dataForTests() {
        return Arrays.asList(new Object[][]{
                {2, 3, 6}, {2, 7, 14}, {0, 3, 0}
        });
    }

    @Before
    public void setUp() {
        calc = new Calculator(); //arrange:
        // создание объекта
    }
//
//    @After
//    public void threadDown() {
//        calc = null;
//    }
//
//    @Test
//    public void add() {
//        int result = (int) calc.add(8, 2); // act: выполнение метода
//        assertEquals(10, result); //
//    }
//
//    @Test
//    public void sub() {
//        int result = (int) calc.sub(8, 2); // act: выполнение метода
//        assertEquals(6, result);
//    }
//
    @Test
    public void mult() {
        int result = (int) calc.mult(8, 2); // act: выполнение метода
        assertEquals(16, result);
    }
//
//    @Test(expected = AException.class)
//    public void div() throws AException {
//        int result = (int) calc.div(8, 2); // act: выполнение метода
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testDivByZeroMessage() {
//        try {
//            double result = calc.div(8, 0);
//            fail("Division by Zero should have thrown a DivByZeroException");
//        } catch (AException e) {
//            assertEquals("Деление на 0", e.getMessage());
//        } catch (Exception e) {
//            fail("Should be DivByZeroException, but have " + e.getClass());
//        }
//    }
//
//    @Ignore("Потомучто")
//    @Test(timeout = 50)
//    public void testTimeOut() throws InterruptedException {
//        double result;
//        double expected;
//        for (int i = 1; i < 10; i++) {
//            result = calc.mult(i, i + 1);
//            expected = i * (i + 1);
//            assertEquals(expected, result, 1e-9);
//            Thread.sleep(2);
//        }
//    }
//
//    @Rule
//    public final TemporaryFolder folder = new TemporaryFolder();
//
//    @Test
//    public void testTempFile() throws IOException {
//        double result;
//        File tempFile = folder.newFile();// задание файла во
//        // временной папке
//        FileWriter writer = new FileWriter(tempFile); //
//        // поток записи
//// в файл
//        for (int i = 2; i < 10; i++) {
//            result = calc.mult(3, i); // вычисление
//            // произведения на 3
//            String str = result + " ";
//            writer.write(str); // запись в файл
//        }
//        writer.close(); // закрыть файл записи
//        BufferedReader reader =
//                new BufferedReader(new FileReader(tempFile));
//        String str = reader.readLine(); // чтение всех данных
//        reader.close();
//        String[] numbers = str.split(" "); // разделение на
//        // строки-числа
//        for (int i = 0; i < 8; i++) {
//            result = Double.parseDouble(numbers[i]); //
//            // преобразование в число
//            assertEquals(3 * (i + 2), result, 1e-9);// проверка
//        }
//    }
//
//    @Rule
//    public final ExpectedException exception =
//            ExpectedException.none();
//
//    @Test
//    public void testDivByZero2() throws AException {
//        exception.expect(AException.class); //
//        // настройка ожидаемого
//// класса исключения
//        exception.expectMessage("Division by Zero"); //
//        // настройка ожидаемого
//// сообщения в исключении
//        double result = calc.div(8, 0); // здесь появляется
//        // исключение
//    }
}