public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 13, 14, 15, 16};
        int[] b = {1, 6, 7, 11, 13, 16, 18};
        int[] uniao = new int[14];
        int[] interseccao = new int[14];
        int[] diferenca = new int[14];
        int contador = 0;
        System.out.println("");
        System.out.println("A ⋃ B: União\n");
        for (int i = 0; i < 7; i++) {
            uniao[i] = a[i];
        }
        for (int i = 7; i < 14; i++) {
            boolean existe = false;
            for (int j = 0; j < 7; j++) {
                if (b[contador] == uniao[j]){
                    existe = true;
                    break;
                }
            }
            if (existe ==  false){
                uniao[i] = b[contador];
            }
            contador++;
        }
        for (int i = 0; i < uniao.length; i++) {
            if (uniao[i] != 0){
                System.out.println(uniao[i]);
            }
        }
        contador = 0;
        System.out.println("\nA ⋂ B: Intersecção\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    interseccao[i] = a[i];
                }
            }
        }
        for (int i = 0; i < interseccao.length; i++) {

            if (interseccao[i] != 0){
                System.out.println(interseccao[i]);
            }
        }
        System.out.println("\nA − B: Diferença\n");
        for (int i = 0; i < a.length; i++) {
            boolean existe = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    existe = true;
                    break;
                }
            }
            if (existe == false){
                diferenca[i] = a[i];
            }
        }
        contador = 7;
        for (int i = 0; i < a.length; i++) {
            boolean existe = false;
            for (int j = 0; j < b.length; j++) {
                if (b[i] == a[j]){
                    existe = true;
                    break;
                }
            }
            if (existe == false){
                diferenca[contador] = b[i];
                contador++;
            }
        }
        for (int i = 0; i < diferenca.length; i++) {
            if (diferenca[i] != 0){
                System.out.println(diferenca[i]);
            }
        }
    }
}