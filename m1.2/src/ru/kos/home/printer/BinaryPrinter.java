package ru.kos.home.printer;

public class BinaryPrinter {
    private static int DEFAULT_SIZE = 8;
    private int size = DEFAULT_SIZE;
    private final int CONSTANTA = 42;
    BinaryPrinter() {
    }

   public BinaryPrinter(int size) {
        this.size = size;
    }

   public void print(long value) {
        for(int i = size -1; i>=0; i--) {
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

   public int getSize() {
        return size;
    }

   public void setSize(int size) throws Exception {
        if (size <=0) {
            throw new Exception("Illegal size:"+size);
        }
        this.size = size;
    }
}
