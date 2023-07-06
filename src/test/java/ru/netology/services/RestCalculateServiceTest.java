package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestCalculateServiceTest {
    @Test

    public void shouldCalcExact() {
        RestCalculateService service = new RestCalculateService();

        int expected = 3;
        int actual = service.calculate (10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldCalcInexact() {
        RestCalculateService service = new RestCalculateService();

        int expected = 4;
        int actual = service.calculate (10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

}
