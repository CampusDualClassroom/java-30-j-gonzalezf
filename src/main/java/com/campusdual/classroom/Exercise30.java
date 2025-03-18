package com.campusdual.classroom;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("No se puede dividir por cero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            divisionWithCustomException(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
