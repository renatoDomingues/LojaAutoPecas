
package lojaautopecas;

public class EntradaPecas extends LojaAutoPecas {
    
    //Atributos:
    String nomePeca = " ";
    String marca;
    String modelo;
    int contagemPeca;
    boolean venda;
    boolean compra;
    int grandesVendas;
    int grandesCompras;
    
    //Metodos personalizados:
    public void vendasPecas(){
        
        if(this.venda){
            this.setContagemPeca(this.getContagemPeca() - 1);
            //this.contagemPeca = this.contagemPeca -1;
            
            System.out.println("=-=-=-=-=-=-=-= Departamento de  VENDAS =-=-=-=-=-=-");
            System.out.println("Saída no estoque a peça: " + this.getNomePeca() 
                    + "\n Marca: " + this.getMarca()
                    + "\n Modelo: " + this.getModelo());
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }
    }
    public void grandesVendas(){
        
        if(this.grandesVendas == 5){
            this.setContagemPeca(this.getContagemPeca() - 5);
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Vendas *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesVendas() 
                + "\n Peças: " + this.getNomePeca() 
                + "\n Marca: " + this.getMarca() + "\n Modelo: " + this.getModelo() );
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else if(this.grandesVendas == 10){
            this.setContagemPeca(this.getContagemPeca() - 10); 
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Vendas *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesVendas() 
                + "\n Peças: " + this.getNomePeca() 
                + "\n Marca: " + this.getMarca() + "\n Modelo: " + this.getModelo() );
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else if(this.grandesVendas == 50){
            this.setContagemPeca(this.getContagemPeca() - 50);
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Vendas *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesVendas() 
                + "\n Peças: " + this.getNomePeca() 
                + "\n Marca: " + this.getMarca() + "\n Modelo: " + this.getModelo() );
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else{
            
            System.out.println("Desculpa, não foi possível completar essa venda!");
        }
        
    }
    public void compraPecas(){
        if(this.compra == true){
            this.setContagemPeca(this.getContagemPeca() + 1);
            // this.contagemPeca = this.contagemPeca + 1;
            
            System.out.println("=-=-=-=-=-=-=-= Departamento de COMPRAS =-=-=-=-=-=-");
            System.out.println("Entrada no estoque a peça: " + this.getModelo()
            + "\n Marca: " + this.getMarca()
            + "\n Modelo: " + this.getModelo());
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }
    }
    public void grandesCompras(){
        if(this.grandesCompras == 5){
            this.setContagemPeca(this.getContagemPeca() + 5);
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Compras *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesCompras() + "\n Peça" 
                    + this.getNomePeca() + "\n Marca: " + this.getMarca() 
                    + "\n Modelo: " + this.getModelo());
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else if(this.grandesCompras == 10){
            this.setContagemPeca(this.getContagemPeca() + 10);
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Compras *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesCompras() + "\n Peça" 
                    + this.getNomePeca() + "\n Marca: " + this.getMarca() 
                    + "\n Modelo: " + this.getModelo());
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else if(this.grandesCompras == 50){
            this.setContagemPeca(this.getContagemPeca() + 50);
            
            System.out.println("*=*=*=*=*=*=*=* Departamento de GRANDES Compras *=*=*=*=*=*=*");
            System.out.println("Quantidades: " + this.getGrandesCompras() + "\n Peça" 
                    + this.getNomePeca() + "\n Marca: " + this.getMarca() 
                    + "\n Modelo: " + this.getModelo());
            System.out.println("Estoque atual: " + this.getContagemPeca());
        }else{
            System.out.println("Desculpa, não foi possivel completar está compra!");
        }
    }
    
    //Metodo construtor:
    public EntradaPecas(String nomePeca, int contagemPeca, String marca, String modelo){
        this.nomePeca = nomePeca;
        this.contagemPeca = contagemPeca;
        this.marca = marca;
        this.modelo = modelo;        
    }
    
    //Metodo toString:
    @Override
    public String toString(){
        return "Entrada da peça: " + nomePeca + "\n Quantidade no estoque: " 
        + contagemPeca + "\n Marca: " + marca + "\n Modelo: " + this.getModelo();
    }
    
    //Metodos Getters e Setters:
    public String getNomePeca(){
        return this.nomePeca;
    }
    public void setNomePeca(String nomePeca){
        this.nomePeca = nomePeca;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getContagemPeca(){
        return this.contagemPeca;
    }
    public void setContagemPeca(int contagemPeca){
        this.contagemPeca = contagemPeca;
    }
    public boolean getVenda(){
        return this.venda;
    }
    public void setVenda(boolean venda){
        this.venda = venda;
    }
    public boolean getCompra(){
        return this.compra;
    }
    public void setCompra(boolean compra){
        this.compra = compra;
    }
    public int getGrandesVendas(){
        return grandesVendas;
    }
    public void setGrandesVendas(int grandesVendas){
        this.grandesVendas = grandesVendas;
    }
    public int getGrandesCompras(){
        return this.grandesCompras;
    }
    public void setGrandesCompras(int grandesCompras){
        this.grandesCompras = grandesCompras;
    }
    
}
