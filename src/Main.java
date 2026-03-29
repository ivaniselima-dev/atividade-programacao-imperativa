public class Main {

    public static void main(String[] args) {

        // Teste simples (opcional)
        int[] A = {1, 5, 2};
        int[] B = {5, 3};
        int[] U = new int[A.length + B.length];

        int tamU = uniao(A, A.length, B, B.length, U);

        System.out.print("União: ");
        for (int i = 0; i < tamU; i++) {
            System.out.print(U[i] + " ");
        }

        System.out.println("\nTamanho: " + tamU);
    }

    // QUESTÃO A
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] U) {

        int tamanhoU = 0;

        // Copiar A para U
        for (int i = 0; i < tamA; i++) {
            U[tamanhoU] = a[i];
            tamanhoU++;
        }

        // Percorrer B
        for (int i = 0; i < tamB; i++) {

            int elemento = b[i];
            boolean existe = false;

            // Verificar repetição
            for (int j = 0; j < tamanhoU; j++) {
                if (U[j] == elemento) {
                    existe = true;
                    break;
                }
            }

            // Inserir se não existir
            if (!existe) {
                U[tamanhoU] = elemento;
                tamanhoU++;
            }
        }

        return tamanhoU;
    }

    // QUESTÃO B
    public static void ordenar(int[] v, int n) {

        for (int i = 1; i < n; i++) {

            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = chave;
        }
    }

    // QUESTÃO C
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {

        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {

            int elemento = v[i];
            boolean existe = false;

            for (int j = 0; j < tamVSR; j++) {
                if (vsr[j] == elemento) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                vsr[tamVSR] = elemento;
                tamVSR++;
            }
        }

        return tamVSR;
    }

    // QUESTÃO D
    public static void rotacionar(int[] v, int tam, int k) {

        if (k < 0) {
            k = k + tam;
        }

        for (int i = 0; i < k; i++) {

            int primeiro = v[0];

            for (int j = 0; j < tam - 1; j++) {
                v[j] = v[j + 1];
            }

            v[tam - 1] = primeiro;
        }
    }
}