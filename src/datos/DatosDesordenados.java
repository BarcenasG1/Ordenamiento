package datos;

public class DatosDesordenados {

    // Atributos
    private int[] valores;

    private int limiteSuperior;
    private int size;

    public DatosDesordenados(int limite, int size) {
        this.valores = new int[size];
        this.limiteSuperior = limite;
        this.size = size;
    }

    public void agregarDato(int valor) {
        valores[size] = valor;
        size++;
    }

    public int getDato(int posicion) {
        return valores[posicion];
    }

    public void generarValores() {
        for (int i = 0; i < valores.length; i++) {
            double aleatorio = Math.random() * limiteSuperior;
            valores[i] = (int) aleatorio + 1;
        }
//------------------------------------------------      

    }

    public int getSize() {
        return size;
    }

    public int getCapacidad() {
        return valores.length;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public int[] getValores() {
        return valores;
    }

    public int[] getCopiaValores() {
        int[] copia = new int[size];
        System.arraycopy(valores, 0, copia, 0, size);
        return copia;
    }

    public DatosOrdenados algoritmoSort() {

        // obtener una copia de los datos desordenados
        int[] arreglo = this.getCopiaValores();

        // agregar algoritmo de ordenación
        // devolver los datos ordenados
        return new DatosOrdenados(arreglo);
    }
// -----------------------------------------------------------------------------

    public DatosOrdenados bubbleSort() {
        cont = 0;
        ci = 0;
        int[] arreglo = this.getCopiaValores();
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                cont++;
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

        return new DatosOrdenados(arreglo);
    }

    public DatosOrdenados bubbleSortMC(int[] valor) {
        cont = 0;
        ci = 0;
        int n = valor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                cont++;
                if (valor[j] > valor[j + 1]) {
                    // intercambiar: swap
                    ci++;
                    int temporal = valor[j];
                    valor[j] = valor[j + 1];
                    valor[j + 1] = temporal;
                }
            }
        }

        return new DatosOrdenados(valor);
    }

    public DatosOrdenados bubbleSortDes() {
        cont = 0;
        ci = 0;
        int[] arreglo = this.getCopiaValores();
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                cont++;
                if (arreglo[j] < arreglo[j + 1]) {
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

        return new DatosOrdenados(arreglo);
    }

    public int dataBubbleSort1() {
        return cont;

    }

    public int dataBubbleSort2() {
        return ci;
    }

    static int cont = 0;
    static int ci = 0;
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
    public DatosOrdenados Quicksort(int[] ar, int tf) {
        conCo = 0;
        conIN = 0;
        if (tf == 2) {
            this.quicksort(ar, 0, ar.length - 1);
            return new DatosOrdenados(ar);
        }
        if (tf == 1) {
            int[] z = this.getCopiaValores();
            this.quicksortDes(z, 0, z.length - 1);
            return new DatosOrdenados(z);
        }

        int[] x = this.getCopiaValores();
        this.quicksort(x, 0, x.length - 1);
        return new DatosOrdenados(x);

    }

    private void quicksortDes(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            conCo++;
            while (A[i] >= pivote && i < j) {
                conCo++;
                i++; // busca elemento mayor que pivote
            }
            while (A[j] < pivote) {
                conCo++;
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado
                conIN++;
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }

        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            conCo++;
            quicksortDes(A, izq, j - 1);          // ordenamos subarray izquierdo

        }
        if (j + 1 < der) {
            conCo++;
            quicksortDes(A, j + 1, der);          // ordenamos subarray derecho

        }

    }

    private void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            conCo++;
            while (A[i] <= pivote && i < j) {
                conCo++;
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                conCo++;
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {
                conIN++;// si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            conCo++;
            quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            conCo++;
            quicksort(A, j + 1, der);          // ordenamos subarray derecho
        }

    }

    public int dataquicksort1() {
        return conIN;

    }

    public int dataquicksort2() {
        return conCo;
    }

    static int conIN;
    static int conCo;

//------------------------------------------------------------------------------
    public DatosOrdenados ShellSort(int[] ar, int tf) {
        conCo = 0;
        conIN = 0;
        if (tf == 2) {
            this.shell(ar);
            return new DatosOrdenados(ar);
        }
        if (tf == 1) {
            int[] z = this.getCopiaValores();
            this.shellDes(z);
            return new DatosOrdenados(z);
        }

        int[] x = this.getCopiaValores();
        this.shell(x);
        return new DatosOrdenados(x);

    }

    private void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;

            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                conCo++;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    conCo++;
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        conIN++;
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }

    private void shellDes(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;

            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                conCo++;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    conCo++;
                    if (A[i - salto] < A[i]) {       // y si están desordenados
                        conIN++;
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }

    public int datashellsort1() {
        return conIN;

    }

    public int datashellsort2() {
        return conCo;
    }

//------------------------------------------------------------------------------   
    public DatosOrdenados RadixSort(int[] ar, int tf) {
        conCo = 0;
        conIN = 0;
        if (tf == 2) {
            this.radixSort(ar);
            return new DatosOrdenados(ar);
        }
        if (tf == 1) {

        }

        int[] x = this.getCopiaValores();
        this.radixSort(x);
        return new DatosOrdenados(x);

    }

    private void radixSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i, j, k, l, f = 0;
        for (k = 0; k < 4; k++) {
            for (i = 0; i < (np.length - 1); i++) {
                np[i][1] = i + 1;
            }
            np[i][1] = -1;
            for (i = 0; i < q.length; i++) {
                q[i] = -1;
            }
            for (f = i = 0; i < arr.length; i++) {
                j = ((0xFF << (k << 3)) & arr[i]) >> (k << 3);
                if (q[j] == -1) {
                    l = q[j] = f;
                } else {
                    l = q[j];
                    while (np[l][1] != -1) {
                        l = np[l][1];
                    }
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for (l = q[i = j = 0]; i < 0x100; i++) {
                for (l = q[i]; l != -1; l = np[l][1]) {
                    arr[j++] = np[l][0];
                }
            }
        }
    }

    private void radixSortDes(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i, j, k, l, f = 0;
        for (k = 0; k < 4; k++) {
            for (i = 0; i < (np.length - 1); i++) {
                np[i][1] = i + 1;
            }
            np[i][1] = -1;
            for (i = 0; i < q.length; i++) {
                q[i] = -1;
            }
            for (f = i = 0; i < arr.length; i++) {
                j = ((0xFF << (k << 3)) & arr[i]) >> (k << 3);
                if (q[j] == -1) {
                    l = q[j] = f;
                } else {
                    l = q[j];
                    while (np[l][1] != -1) {
                        l = np[l][1];
                    }
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for (l = q[i = j = 0]; i < 0x100; i++) {
                for (l = q[i]; l != -1; l = np[l][1]) {
                    arr[j++] = np[l][0];
                }
            }
        }
    }

//------------------------------------------------------------------------------ 
    @Override
    public String toString() {
        String cad = "";
        for (int x : valores) {
            cad += x + ",";
        }
        return cad;
    }

}
