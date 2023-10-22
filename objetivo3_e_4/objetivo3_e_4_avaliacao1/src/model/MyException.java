package model;

public class MyException {

    public static void getError() {
        myThrowException();
    }

    private static void myThrowException() {
        try {
            System.out.println("\nErro no pedido! Estoque insuficiente.\n");
            throw new EstoqueException();
        } catch (EstoqueException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally executado em myThrowException()");
        }
    }

    static class EstoqueException extends Exception {
        public EstoqueException() {
            super("\nErro no pedido! Estoque insuficiente.\n");
        }
    }
}
