package com.slr.demo.CalculationController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculationController<calculation> {

    private final calculation calculation = new calculation();

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return calculation.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculation.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculation.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculation.divide(a, b);
    }
}
