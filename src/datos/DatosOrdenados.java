
package datos;


public class DatosOrdenados {
      private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    
    public int[] getArray(){

          return valores;

    }
    
    @Override
    public String toString(){
        String cad = "";
        for (int x : valores){
            cad += x + ",";
        }
        return cad;
    }
}
