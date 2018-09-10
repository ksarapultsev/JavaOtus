package ru.kos.home;

import ru.kos.home.printer.BinaryPrinter;

public class Main {

    public static void main(String[] args) {
        BinaryPrinter printer = createPrinter(12);

        System.out.println("Size:"+printer.getSize());
        int value = -12;
        printer.print(value);
        doPrint(printer, value);
        System.out.println("Size:"+printer.getSize());

    }

    private static BinaryPrinter createPrinter(int size) {
        BinaryPrinter printer = new BinaryPrinter(size);
        return printer;
    }

    private static void doPrint(BinaryPrinter printer, int value) {
        printer.print(value);
        try {
            printer.setSize(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
