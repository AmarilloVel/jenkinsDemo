package com.example.apiDemo;

import com.example.apiDemo.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApiDemoApplicationTests {

	@Test
	void contextLoads() {
	}


    @Test
    void testDescuentoPositivo() {
        DemoController controller = new DemoController();
        // ESTO VA A PASAR (Verde)
        assertEquals(90, controller.calculateDiscount(100));
    }

    @Test
    void testDescuentoNegativo() {
        DemoController controller = new DemoController();
        // PARA LA DEMO: Cambia el 90 por un 50 para que el test falle
        // assertEquals(50, controller.calcularDescuento(100));
        assertEquals(90, controller.calculateDiscount(100));
    }
}
