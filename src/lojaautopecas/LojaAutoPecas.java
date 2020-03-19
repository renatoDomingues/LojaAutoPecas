
package lojaautopecas;

public class LojaAutoPecas {

    public static void main(String[] args) {
        
        //Programa Principal
        EntradaPecas ford [] = new EntradaPecas[2];
        EntradaPecas GM[] = new EntradaPecas[2];
        //EntradaPecas ford = new EntradaPecas();
        
        ford[0] = new EntradaPecas("Radiador", 80, "ford", "ka 1.0");
        GM[0] = new EntradaPecas("Cabeçote", 100, "Chevrolet", "Onix 1.0");
        
        
        ford[0].setGrandesVendas(5);
        //GM[0].setCompra(true);
        GM[0].setGrandesCompras(10);
        
        
        
        System.out.println(GM[0].toString());
        //ford[0].grandesVendas();
        //GM[0].compraPecas();
        GM[0].grandesCompras();



    }
    
}
