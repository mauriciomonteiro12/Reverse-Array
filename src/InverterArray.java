public class InverterArray {

    public static void inverter(int[] arr, int inicio, int fim) {

        if(inicio >= fim) {
            return;
        }
        int temp = arr[inicio];
        arr[inicio] = arr[fim];
        arr[fim] = temp;

        inverter(arr, inicio + 1, fim - 1);
    }
}
