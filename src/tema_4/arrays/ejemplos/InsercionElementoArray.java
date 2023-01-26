package tema_4.arrays.ejemplos;
/*** CANDIDATO A EXAMEN  ***/
public class InsercionElementoArray {
    public static void main(String[] args) {
       int e = 8;
       int pos = 3;
       int[] in = {7,1,5,2};
    }
/**Terminar este y hacerlo con dos bucles*/
    int[] inserta(int[] in,int e, int pos){
        int[] out = new int[in.length+1];
        for(int i = 0; i < in.length; i++){
            out[i] = in[i];
            if(in[i]==pos){
                out[pos]=e;
            }
        }
     return out;
    }

}
