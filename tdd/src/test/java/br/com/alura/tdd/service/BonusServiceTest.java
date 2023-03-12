package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        //Melhor abordagem
//        assertThrows(IllegalArgumentException.class,
//                () -> service.calcularBonus(new Funcionario("Ricard", LocalDate.now(), new BigDecimal("25000"))));
        // Se precisar tratar erro
        try {
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu a exception!");
        } catch (Exception e) {
            assertEquals("Funcionário com salário maior do que R$10000 nao pode receber bonus!", e.getMessage());
        }
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService service = new BonusService();
        Funcionario ricard = new Funcionario("Ricard", LocalDate.now(), new BigDecimal("2500"));
        BigDecimal bonus = service.calcularBonus(ricard);

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMil() {
        BonusService service = new BonusService();
        Funcionario ricard = new Funcionario("Ricard", LocalDate.now(), new BigDecimal("10000"));
        BigDecimal bonus = service.calcularBonus(ricard);

        assertEquals(new BigDecimal("1000.00"), bonus); // P
    }

}