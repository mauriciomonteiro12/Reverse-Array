public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: ");
        ArrayUtil.imprimirArray(array);

        InverterArray.inverter(array, 0, array.length - 1 );

        System.out.println("Array invertido: ");
        ArrayUtil.imprimirArray(array);
    }
}